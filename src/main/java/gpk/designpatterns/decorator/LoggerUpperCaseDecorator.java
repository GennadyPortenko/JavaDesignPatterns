package gpk.designpatterns.decorator;

import gpk.designpatterns.ILogger;

public class LoggerUpperCaseDecorator implements ILogger {
    private Logger logger = new Logger();

    public void log(String message, LogLevel logLevel) {
        logger.log(message.toUpperCase(), logLevel);
    }
}
