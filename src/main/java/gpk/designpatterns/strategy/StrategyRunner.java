package gpk.designpatterns.strategy;

import gpk.designpatterns.IExampleRunner;
import gpk.designpatterns.ISimpleLogger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class StrategyRunner implements IExampleRunner {
    public void run() {
        ISimpleLogger commonStrategy = new CommonLoggingStrategy();
        ISimpleLogger uppercaseStrategy = new UppercaseLoggingStrategy();

        SimpleLogger simpleLogger = new SimpleLogger(commonStrategy);

        simpleLogger.write("common message");

        simpleLogger.setStrategy(uppercaseStrategy);
        simpleLogger.write("uppercase message");
    }
}

