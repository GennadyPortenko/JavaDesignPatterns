package gpk.designpatterns.decorator;

import gpk.designpatterns.IExampleRunner;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class DecoratorRunner implements IExampleRunner {
    public void run() {
        LoggerUpperCaseDecorator loggerUpperCase = new LoggerUpperCaseDecorator();
        loggerUpperCase.log("It's me, Decorator!");
    }
}

