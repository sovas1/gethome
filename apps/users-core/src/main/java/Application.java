import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import sample.project.model.User;

/**
 * Created by sovas on 05.03.2017.
 */
@SpringBootApplication
@ComponentScan(basePackages = "sample.project")
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

        User user = User.builder()
                .id(1)
                .firstName("Marian")
                .lastName("Paździoch")
                .build();


        System.out.println("\n" + user.toString() + "\n");
    }

}
