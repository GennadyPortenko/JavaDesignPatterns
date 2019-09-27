package gpk.designpatterns.builder;

import gpk.designpatterns.CommonLogger;

public class Logger extends CommonLogger {

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
