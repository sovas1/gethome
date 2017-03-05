import sample.project.model.User;

/**
 * Created by sovas on 05.03.2017.
 */
public class Application {

    public static void main(String[] args) {

        User user = User.builder()
                .id(1)
                .firstName("Marian")
                .lastName("Paździoch")
                .build();


        System.out.println("\n" + user.toString() + "\n");
    }

}
