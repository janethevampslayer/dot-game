package org.launchcode.dotgame.controllers;

import org.launchcode.dotgame.data.UserRepository;
import org.launchcode.dotgame.models.Game;
import org.launchcode.dotgame.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
//@RequestMapping("user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("home")
    public String displayUserHome(HttpSession session, Model model) {
        Object userId = session.getAttribute("user");
        Optional<User> result = userRepository.findById((Integer) userId);
        User user = result.get();
        model.addAttribute("username", "Welcome, " + user.getUsername() + ".");
        return "user/home";
    }

    @GetMapping("savedGames")
    public String displaySavedGames(HttpSession session, Model model) {
        List<Game> savedGames = new ArrayList<>();
        Object userId = session.getAttribute("user");
        Optional<User> result = userRepository.findById((Integer) userId);
        User user = result.get();
        model.addAttribute("username", user.getUsername() + "'s saved games");
        return "user/saved-games";
    }
}
