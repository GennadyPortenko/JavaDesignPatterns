package gpk.designpatterns.strategy;

import gpk.designpatterns.ISimpleLogger;

public class UppercaseLoggingStrategy implements ISimpleLogger {
    @Override
    public void log(String message) {
        System.out.println(message.toUpperCase());
    }
}
