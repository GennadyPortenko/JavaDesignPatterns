package gpk.designpatterns;

import java.io.PrintStream;

public class CommonLogger {
    public enum LogLevel {
        LOG_MSG, LOG_WARNING, LOG_ERROR
    }

    private String name = "Default";
    private LogLevel logLevel = LogLevel.LOG_MSG;

    public String getName() {
        return name;
    }
    public LogLevel getLogLevel() {
        return logLevel;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public void log(String message) {
        PrintStream out = (logLevel == LogLevel.LOG_ERROR) ? System.err : System.out;
        out.println(this.name + " [" + this.logLevel.toString() + "] - " + message);
    }

}
