package com.liliana.curso.springboot.webapp.springbootweb.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liliana.curso.springboot.webapp.springbootweb.models.User;
import com.liliana.curso.springboot.webapp.springbootweb.models.dto.ParamDto;

@RestController
@RequestMapping("api/var")
public class PathVariableController {
    @Value("${config.username}")
    private String username;
    //@Value("${config.message}")
    //private String message;
    @Value("${config.listOfValues}")
    private String[] listOfValues;
    @Value("${config.code}")
    private Integer code;

    @GetMapping("baz/{message}")
    public ParamDto bas(@PathVariable String message){
        ParamDto param=new ParamDto();
        param.setMessage(message);
        return param;

    }
    @GetMapping("/mix/{product}/{id}")
    public Map<String,Object> mixPathVar(@PathVariable String product, @PathVariable Long id){
        Map<String,Object> params=new HashMap<>();
        params.put("product",product);
         params.put("id",id);
        return params;


    }
    @PostMapping("/create")
    public User create(@RequestBody User user){
        user.setName(user.getName().toUpperCase());
        return user;
    }

    @GetMapping("/values")
    public Map<String,Object> values(@Value("${config.message}")String message){
        Map<String,Object> json=new HashMap<>();
        json.put("message",message);
        json.put("code",code);
        json.put("listOfValues",listOfValues);
        json.put("username",username);
        return json;
    }

}
