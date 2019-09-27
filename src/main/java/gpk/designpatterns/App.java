package gpk.designpatterns;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);

        IExampleRunner exampleRunner =
                context.getBean(gpk.designpatterns.builder.Runner.class);

        exampleRunner.run();
    }
}
