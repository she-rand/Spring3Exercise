package com.liliana.curso.springboot.webapp.springbootweb.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liliana.curso.springboot.webapp.springbootweb.models.User;

@RestController
@RequestMapping("/api")
public class UserRestController {

   @GetMapping("/details")
    public Map<String,Object> details() {
        Map<String,Object> body= new HashMap<>();
        User user =new User("Inga","Gatinga");
        body.put("user",user);

        return body;
    }

}
