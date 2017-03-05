package sample.project.model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

/**
 * Created by sovas on 05.03.2017.
 */
@Getter
@Builder
@ToString
public class User {

    private Integer id;
    private String firstName;
    private String lastName;

}
