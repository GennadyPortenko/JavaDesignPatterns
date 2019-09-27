package gpk.designpatterns.decorator;

import gpk.designpatterns.CommonLogger;

public class LoggerUpperCaseDecorator {
    private CommonLogger logger = new CommonLogger();

    public void logUpperCase(String message) {
        logger.log(message.toUpperCase());
    }
}
