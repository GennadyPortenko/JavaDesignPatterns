package gpk.designpatterns.abstractfactory;

import gpk.designpatterns.ILogger;

public class ImprovedLoggerFactory implements AbstractLoggerFactory {
    public ILogger getLogger() {
        return (message, logLevel) -> {
            switch (logLevel) {
                case LOG_NOTICE:
                case LOG_WARNING:
                    System.out.println(logLevel.toString() + " : " + message);
                    break;
                case LOG_ERROR:
                    System.err.println(logLevel.toString() + " : " + message);
                    break;
            }
        };
    }
    public String getLoggerName() {
        return "Improved logger";
    }
}
