package gpk.designpatterns.abstractfactory;

import gpk.designpatterns.ILogger;

public interface AbstractLoggerFactory {
    ILogger getLogger();
    String getLoggerName();
}
