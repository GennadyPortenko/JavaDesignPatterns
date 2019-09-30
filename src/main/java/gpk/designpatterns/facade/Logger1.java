package gpk.designpatterns.facade;

public class Logger1 {
    public enum Level {
        NOTICE, WARN, ERR
    }
    public void write(String message, Level level) {
        System.out.println(message);
    }
}
