package gpk.designpatterns.strategy;

import gpk.designpatterns.ISimpleLogger;

public class CommonLoggingStrategy implements ISimpleLogger {
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
