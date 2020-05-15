package org.launchcode.dotgame.controllers;

import org.launchcode.dotgame.models.Game;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameController {

    @GetMapping("/newGame")
    public String displayNewGame(Model model) {
        Game newGame = new Game();
        newGame.generateAddends();
        model.addAttribute("addendOne", newGame.getAddendOne());
        model.addAttribute("addendTwo", newGame.getAddendTwo());
        return "/game/game-board";
    }
}
