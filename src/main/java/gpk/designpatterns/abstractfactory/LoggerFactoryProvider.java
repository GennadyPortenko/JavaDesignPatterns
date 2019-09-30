package gpk.designpatterns.abstractfactory;

public class LoggerFactoryProvider {
    public static AbstractLoggerFactory getLoggerFactory(String type) {
        switch (type) {
            case "simple":
                return new SimpleLoggerFactory();
            case "improved":
                return new ImprovedLoggerFactory();
            default:
                throw new UnsupportedOperationException("Wrong Logger Factory type : " + type);
        }
    }
}
