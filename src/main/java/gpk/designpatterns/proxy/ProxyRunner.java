package gpk.designpatterns.proxy;

import gpk.designpatterns.ILogger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.lang.reflect.*;

@Component
@Scope("prototype")
public class ProxyRunner implements Runnable {
    public void run() {
        ILogger logger = new Logger();
        logger.log("It's me, Logger!");

        ILogger loggerProxy = (ILogger)Proxy.newProxyInstance(logger.getClass().getClassLoader(), logger.getClass().getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
                    boolean pass = false;
                    Parameter[] parameters = method.getParameters();
                    if ( method.getName().equals("log") && (method.getParameterCount() == 2) &&
                         parameters[0].getName().equals("message") && parameters[1].getName().equals("logLevel") &&
                         args[1] == ILogger.LogLevel.LOG_WARNING ) {

                        System.out.println("\n````````````````````````````````````````");
                        Object retVal = method.invoke(logger, args);
                        System.out.println("````````````````````````````````````````\n");
                        return retVal;
                    } else {
                        return method.invoke(logger, args);
                    }
                }
            });

        loggerProxy.log("Warning from Logger Proxy!", ILogger.LogLevel.LOG_WARNING);
        loggerProxy.log("Notice from Logger Proxy!", ILogger.LogLevel.LOG_NOTICE);
    }
}
