package org.launchcode.dotgame.controllers;

import org.launchcode.dotgame.models.Game;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("/newGame")
public class GameController {

    @GetMapping("/newGame")
    public String displayNewGame(Model model) {
        Game newGame = new Game();
        model.addAttribute("addendOne", newGame.getAddendOne());
        model.addAttribute("addendTwo", newGame.getAddendTwo());
        model.addAttribute("sum", newGame.getSum());
        return "/game/game-board";
    }

//    @RequestMapping()
//    public String processGame(Model model, @RequestParam int answer) {
//        if
//    }
}
