package gpk.designpatterns.builder;

import gpk.designpatterns.IExampleRunner;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BuilderRunner implements IExampleRunner {
    public void run() {
       Logger logger = Logger.builder().name("My Application").defaultLogLevel(Logger.LogLevel.LOG_ERROR).build();
       logger.log("It's me, Builder exapmle!");
    }
}
