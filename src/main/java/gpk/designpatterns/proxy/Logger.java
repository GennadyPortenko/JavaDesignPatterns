package gpk.designpatterns.proxy;

import gpk.designpatterns.ILogger;

public class Logger implements ILogger {
    @Override
    public void log(String message, LogLevel logLevel) {
        System.out.println(logLevel.toString() + " : " + message);
    }
}
