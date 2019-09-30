package gpk.designpatterns.abstractfactory;

import gpk.designpatterns.ILogger;

public class SimpleLoggerFactory implements AbstractLoggerFactory {
    public ILogger getLogger() {
        return (message, logLevel) -> System.out.println(logLevel.toString() + " : " + message);

    }
    public String getLoggerName() {
        return "Simple logger";
    }
}
