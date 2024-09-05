package org.example.controller;

import org.example.User.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/v1")
    public List<User> getUsers(){
        List<User> users = new ArrayList<>();
        User user = new User();


        user.setName("Katerina");
        user.setSurname("Hods");
        user.setNickname("KatHods");
        user.setId(1L);

        User user2 = new User("Teodor", "Novak",2L, "Teos20");
        User user3 = new User("Jane", "Smith",3L, "JaneSmth18");

        users.add(user);
        users.add(user2);
        users.add(user3);

        return users;

    }

}
