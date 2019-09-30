package gpk.designpatterns.builder;

import gpk.designpatterns.ILogger;

import java.io.PrintStream;

public class Logger implements ILogger {
    private String name = "Default";
    private ILogger.LogLevel defaultLogLevel = ILogger.LogLevel.LOG_NOTICE;

    public void setName(String name) {
        this.name = name;
    }
    public void setDefaultLogLevel(ILogger.LogLevel defaultLogLevel) {
        this.defaultLogLevel = defaultLogLevel;
    }

    @Override
    public void log(String message, LogLevel logLevel) {
        PrintStream out = (logLevel == ILogger.LogLevel.LOG_ERROR) ? System.err : System.out;
        out.println(this.name + " [" + this.defaultLogLevel.toString() + "] - " + message);
    }

    @Override
    public void log(String message) {
        log(message, defaultLogLevel);
    }

    public static LoggerBuilder builder() {
        return new LoggerBuilder();
    }

    public static class LoggerBuilder {
        private String name = "Default";
        private ILogger.LogLevel logLevel = ILogger.LogLevel.LOG_NOTICE;

        private LoggerBuilder() {
        }

        public LoggerBuilder name(String name) {
            this.name = name;
            return this;
        }
        public LoggerBuilder defaultLogLevel(ILogger.LogLevel logLevel) {
            this.logLevel = logLevel;
            return this;
        }

        public Logger build() {
            Logger logger = new Logger();
            logger.setName(this.name);
            logger.setDefaultLogLevel(this.logLevel);
            return logger;
        }
    }

}
