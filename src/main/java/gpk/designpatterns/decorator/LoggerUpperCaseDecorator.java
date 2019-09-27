package gpk.designpatterns.decorator;

public class LoggerUpperCaseDecorator {
    private Logger logger = new Logger();

    public void logUpperCase(String message) {
        logger.log(message.toUpperCase());
    }
}
