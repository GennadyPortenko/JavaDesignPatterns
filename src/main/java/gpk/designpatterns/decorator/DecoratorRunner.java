package gpk.designpatterns.decorator;

import gpk.designpatterns.IExampleRunner;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class DecoratorRunner implements IExampleRunner {
    public void run() {
        LoggerUpperCaseDecorator logger = new LoggerUpperCaseDecorator();
        logger.logUpperCase("It's me!");
    }
}

