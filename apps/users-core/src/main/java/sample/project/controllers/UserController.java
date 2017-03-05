package sample.project.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sample.project.model.User;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<User> getUsers() {

        User user = User.builder()
                .id(1)
                .firstName("Marian")
                .lastName("Paździoch")
                .build();

        return Stream.of(user)
                .collect(Collectors.toList());
    }


}
