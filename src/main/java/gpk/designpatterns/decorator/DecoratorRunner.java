package gpk.designpatterns.decorator;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class DecoratorRunner implements Runnable {
    public void run() {
        LoggerUpperCaseDecorator loggerUpperCase = new LoggerUpperCaseDecorator();
        loggerUpperCase.log("It's me, Decorator!");
    }
}

