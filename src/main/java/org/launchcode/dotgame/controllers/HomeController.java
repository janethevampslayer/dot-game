package org.launchcode.dotgame.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("")
    public String displayLogin() {

        return "index";
    }

    @GetMapping("home")
    public String displayUserHome() {
        return "user-home";
    }

    @GetMapping("create")
    public String displayCreateNewUserForm() {
        return "create-user";
    }





}
