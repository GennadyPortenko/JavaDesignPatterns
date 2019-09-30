package gpk.designpatterns.facade;


import gpk.designpatterns.IExampleRunner;
import gpk.designpatterns.ILogger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class FacadeRunner implements IExampleRunner {
    public void run() {
        LoggerFacade logger1 = new LoggerFacade(Logger1.class);
        logger1.log("Notice from Logger1", ILogger.LogLevel.LOG_NOTICE);
        logger1.log("Warning from Logger1", ILogger.LogLevel.LOG_WARNING);
        logger1.log("Error from Logger1", ILogger.LogLevel.LOG_ERROR);

        System.out.println();

        LoggerFacade logger2 = new LoggerFacade(Logger2.class);
        logger2.log("Notice from Logger2", ILogger.LogLevel.LOG_NOTICE);
        logger2.log("Warning from Logger2", ILogger.LogLevel.LOG_WARNING);
        logger2.log("Error from Logger2", ILogger.LogLevel.LOG_ERROR);
    }
}

