package gpk.designpatterns.facade;

public class Logger2 {
    public enum LogLevel {
        NOTICE, WARNING, ERROR
    }
    public void logMessage(String message, LogLevel logLevel) {
        switch (logLevel) {
            case NOTICE:
            case WARNING:
                System.out.println(logLevel + " : " +  message);
                break;
            case ERROR:
                System.err.println(logLevel + " : " +  message);
                break;
        }
    }
}
