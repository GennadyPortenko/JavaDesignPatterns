package gpk.designpatterns;

public interface ILogger {
    enum LogLevel {
        LOG_NOTICE, LOG_ERROR, LOG_WARNING
    }

    default void log(String message) {
        log(message, LogLevel.LOG_NOTICE);
    }
    void log(String message, LogLevel logLevel);
}
