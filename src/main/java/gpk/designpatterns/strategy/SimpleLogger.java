package gpk.designpatterns.strategy;

import gpk.designpatterns.ISimpleLogger;

public class SimpleLogger {
    private ISimpleLogger strategy;
    public SimpleLogger(ISimpleLogger strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(ISimpleLogger strategy) {
        this.strategy = strategy;
    }

    public void write(String message) {
        strategy.log(message);
    }
}
