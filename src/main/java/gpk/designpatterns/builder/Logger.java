package gpk.designpatterns.builder;

import gpk.designpatterns.ILogger;

import java.io.PrintStream;

public class Logger implements ILogger {

    public enum LogLevel {
        LOG_MSG, LOG_WARNING, LOG_ERROR
    }

    private String name = "Default";
    private LogLevel logLevel = LogLevel.LOG_MSG;

    public void setName(String name) {
        this.name = name;
    }
    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    @Override
    public void log(String message) {
        PrintStream out = (logLevel == LogLevel.LOG_ERROR) ? System.err : System.out;
        out.println(this.name + " [" + this.logLevel.toString() + "] - " + message);
    }

    public static LoggerBuilder builder() {
        return new LoggerBuilder();
    }

    public static class LoggerBuilder {
        private String name = "Default";
        private LogLevel logLevel = LogLevel.LOG_MSG;

        private LoggerBuilder() {
        }

        public LoggerBuilder name(String name) {
            this.name = name;
            return this;
        }
        public LoggerBuilder logLevel(LogLevel logLevel) {
            this.logLevel = logLevel;
            return this;
        }

        public Logger build() {
            Logger logger = new Logger();
            logger.setName(this.name);
            logger.setLogLevel(this.logLevel);
            return logger;
        }
    }

}
