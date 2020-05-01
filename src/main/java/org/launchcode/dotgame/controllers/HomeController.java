package org.launchcode.dotgame.controllers;

import org.launchcode.dotgame.data.UserRepository;
import org.launchcode.dotgame.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class HomeController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("")
    public String displayLogin() {

        return "index";
    }

    @GetMapping("create")
    public String displayCreateNewUserForm(Model model) {
        model.addAttribute(new User());
        return "create-user";
    }

    @PostMapping("create")
    public String createNewUser(@ModelAttribute @Valid User user, Model model) {
        userRepository.save(user);
        return "create-user";
    }

}
