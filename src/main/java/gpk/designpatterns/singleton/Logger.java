package gpk.designpatterns.singleton;

import gpk.designpatterns.ISimpleLogger;

import java.time.Instant;

public class Logger implements ISimpleLogger {
    private Instant initialTime;
    public Instant getInitialTime() {
        return initialTime;
    }
    private Logger() {}
    private static volatile Logger instance = null;
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                    instance.initialTime = Instant.now();
                }
            }
        }
        return instance;
    }

    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
