package com.nebula.helixapp.resource;

import com.nebula.helixapp.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserResource {

    @GetMapping(value = "/home")
    public String showUser(){
        return  "Application works!";
    }
}
