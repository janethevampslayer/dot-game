package org.launchcode.dotgame.controllers;

import org.launchcode.dotgame.data.UserRepository;
import org.launchcode.dotgame.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
//@RequestMapping("user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("home")
    public String displayUserHome() {

        return "user/user-home";
    }



}
