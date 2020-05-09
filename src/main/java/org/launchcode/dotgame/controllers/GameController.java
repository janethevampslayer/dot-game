package org.launchcode.dotgame.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameController {

    @GetMapping("/newGame")
    public String displayNewGame() {
        return "/game/game-board";
    }
}
