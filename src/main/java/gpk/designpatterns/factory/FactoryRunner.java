package gpk.designpatterns.factory;


import gpk.designpatterns.IExampleRunner;
import gpk.designpatterns.ILogger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class FactoryRunner implements IExampleRunner {
    public void run() {
        try {
            ILogger simpleLogger = LoggerFactory.getLogger("simple");
            simpleLogger.log("It's me, Simple Logger!", ILogger.LogLevel.LOG_ERROR);

            ILogger improvedLogger = LoggerFactory.getLogger("improved");
            improvedLogger.log("It's me, Improved Logger!", ILogger.LogLevel.LOG_ERROR);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

