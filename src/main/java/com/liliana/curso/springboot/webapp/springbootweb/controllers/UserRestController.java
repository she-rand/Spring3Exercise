package com.liliana.curso.springboot.webapp.springbootweb.controllers;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liliana.curso.springboot.webapp.springbootweb.models.User;
import com.liliana.curso.springboot.webapp.springbootweb.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

   @GetMapping("/details")
    public UserDto details() {
        UserDto userDto=new UserDto();
        User user =new User("Inga","Gatinga");

        userDto.setUser(user);
        userDto.setTitle("Hola");

        return userDto;
    }
    @GetMapping("/list")
    public List<User> list() {

        User user=new User("Inga", "Gatinga");
        User user2= new User("Inga", "Gatinga");
        User user3= new User("Inga", "Gatinga");
        // List<User> users = new ArrayList<>();
        // users.add(user);
        // users.add(user2);
        // users.add(user3);

        List<User> users = Arrays.asList(user,user2,user3);
       

        return users;
    }

    @GetMapping("/details-map")
    public Map<String,Object> detailsMap() {
        Map<String,Object> body= new HashMap<>();
        User user =new User("Inga","Gatinga");
        body.put("user",user);

        return body;
    }

}
