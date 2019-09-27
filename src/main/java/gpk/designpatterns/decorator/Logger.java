package gpk.designpatterns.decorator;

import gpk.designpatterns.ILogger;

public class Logger implements ILogger {
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
