package gpk.designpatterns.abstractfactory;


import gpk.designpatterns.IExampleRunner;
import gpk.designpatterns.ILogger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class AbstractFactoryRunner implements IExampleRunner {
    public void run() {
        AbstractLoggerFactory simpleLoggerFactory = LoggerFactoryProvider.getLoggerFactory("simple");
        AbstractLoggerFactory improvedLoggerFactory = LoggerFactoryProvider.getLoggerFactory("improved");

        System.out.println(simpleLoggerFactory.getLoggerName() + " : ");
        simpleLoggerFactory.getLogger().log("Error!", ILogger.LogLevel.LOG_ERROR);

        System.out.println(improvedLoggerFactory.getLoggerName() + " : ");
        improvedLoggerFactory.getLogger().log("Error!", ILogger.LogLevel.LOG_ERROR);
    }
}

