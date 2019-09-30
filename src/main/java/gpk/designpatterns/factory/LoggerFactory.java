package gpk.designpatterns.factory;

import gpk.designpatterns.ILogger;

import javax.naming.OperationNotSupportedException;

public class LoggerFactory {
    static ILogger getLogger(String type) throws OperationNotSupportedException {
        switch (type) {
            case "simple":
                return (message, logLevel) -> {
                    System.out.println(logLevel.toString() + " : " + message);
                };
            case "improved":
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
            default:
                throw new OperationNotSupportedException();
        }
    }
}
