package org.launchcode.dotgame.controllers;

import org.launchcode.dotgame.data.GameRepository;
import org.launchcode.dotgame.data.UserRepository;
import org.launchcode.dotgame.models.Game;
import org.launchcode.dotgame.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;

@Controller("/newGame")
public class GameController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private GameRepository gameRepository;

    @GetMapping("/newGame")
    public String displayNewGame(Model model) {
        Game newGame = new Game();
        model.addAttribute("newGame", newGame);
        model.addAttribute("addendOne", newGame.getAddendOne());
        model.addAttribute("addendTwo", newGame.getAddendTwo());
        model.addAttribute("sum", newGame.getSum());
        return "/game/game-board";
    }

    @PostMapping("/newGame")
    public String processNewGame(HttpSession session, Model model, @ModelAttribute Game game) {
        Object userId = session.getAttribute("user");
        Optional<User> result = userRepository.findById((Integer) userId);
        User user = result.get();
        game.setUser(user);
        gameRepository.save(game);
        List<Game> savedGames = user.getGames();
        model.addAttribute("username", user.getUsername() + "'s saved games");
        model.addAttribute("games", savedGames);
        return "user/saved-games";
    }
}
