package gpk.designpatterns.facade;

import gpk.designpatterns.ILogger;

public class LoggerFacade implements ILogger {

    Object logger;
    private Class loggerClass;

    LoggerFacade(Class clazz) {
        if (clazz == Logger1.class) {
            logger = new Logger1();
        } else if (clazz == Logger2.class) {
            logger = new Logger2();
        } else {
            throw new UnsupportedOperationException("Wrong logger class : " + clazz.getName());
        }
        loggerClass = clazz;
    }

    @Override
    public void log(String message, LogLevel logLevel) {
        if (loggerClass == Logger1.class) {
            Logger1.Level level = logLevel == LogLevel.LOG_NOTICE ? Logger1.Level.NOTICE :
                                  logLevel == LogLevel.LOG_WARNING ? Logger1.Level.WARN : Logger1.Level.ERR;
            ((Logger1)logger).write(message, level);
        } else if (loggerClass == Logger2.class) {
            Logger2.LogLevel level = logLevel == LogLevel.LOG_NOTICE ? Logger2.LogLevel.NOTICE:
                                     logLevel == LogLevel.LOG_WARNING ? Logger2.LogLevel.WARNING: Logger2.LogLevel.ERROR;
            ((Logger2)logger).logMessage(message, level);
        }
    }
}
