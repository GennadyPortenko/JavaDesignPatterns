package gpk.designpatterns.decorator;

import gpk.designpatterns.ILogger;

public class Logger implements ILogger {
    @Override
    public void log(String message, LogLevel logLevel) {
        switch(logLevel) {
            case LOG_NOTICE:
            case LOG_WARNING:
                System.out.println(message);
                break;
            case LOG_ERROR:
                System.err.println(message);
                break;
        }
    }
}
