package com.liliana.curso.springboot.webapp.springbootweb.controllers;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.liliana.curso.springboot.webapp.springbootweb.models.User;

@Controller
public class UserController {

   @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Chanclas","Migato");
        model.addAttribute("title","Hola");
        model.addAttribute("user", user);
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model){
       
        model.addAttribute("title", "Hola");
        //model.addAttribute("users", users);
        return "list";
    } 

    @ModelAttribute("users")
    public List<User> userModel(){
        return  Arrays.asList(
        new User("Don Gato","Gato"),
        new User("Gato","Cosmico"),
        new User("Garfield","Bonachon")
        );

    }

}
