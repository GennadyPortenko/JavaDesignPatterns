package gpk.designpatterns.singleton;

import org.springframework.stereotype.Component;

@Component
public class SingletonRunner implements Runnable {
    @Override
    public void run() {
        Logger loggerInstance = Logger.getInstance();
        Logger anotherLoggerInstance = Logger.getInstance();

        System.out.println(loggerInstance.getInitialTime());
        System.out.println(anotherLoggerInstance.getInitialTime());
    }
}
