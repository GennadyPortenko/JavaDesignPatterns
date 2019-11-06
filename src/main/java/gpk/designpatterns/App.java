package gpk.designpatterns;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);

        Runnable exampleRunner =
                // context.getBean(BuilderRunner.class);
                // context.getBean(gpk.designpatterns.decorator.DecoratorRunner.class);
                // context.getBean(gpk.designpatterns.abstractfactory.AbstractFactoryRunner.class);
                // context.getBean(gpk.designpatterns.factory.FactoryRunner.class);
                // context.getBean(gpk.designpatterns.proxy.ProxyRunner.class);
                // context.getBean(gpk.designpatterns.facade.FacadeRunner.class);
                // context.getBean(gpk.designpatterns.strategy.StrategyRunner.class);
                context.getBean(gpk.designpatterns.singleton.SingletonRunner.class);


        exampleRunner.run();
    }
}
