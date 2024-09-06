package org.example.controller;

import org.example.User.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    /*  #Functional API Testing#

    This UserController is a simple REST controller in Spring Boot that manages a list of users for learning purposes (without a database). It provides:

    GET /users/create: Adds three default users to a list.
    GET /users: Returns the list of all users.
    GET /users/{id}: Returns a placeholder user with the specified ID.
    POST /users: Adds a new user from the request body to the list.
    In a real-world scenario, these actions would interact with a database.

    -> Testing via API Postman
     */


    List<User> users = new ArrayList<>();

    public void createDefaultUsers() {
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
    }


    @GetMapping("/create")
    public void createUsers(){
        createDefaultUsers();
    }

    @GetMapping
    public List<User> getUsers(){
        return users;
    }


    //these 'users' would be fetched from a database -> only for learning purpose now
    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Long id){
    User user = new User("User","ID",id, null);
    return user;
    }


    @PostMapping
    public User createUser(@RequestBody User user) {
        users.add(user);
        return user;
    }

}
