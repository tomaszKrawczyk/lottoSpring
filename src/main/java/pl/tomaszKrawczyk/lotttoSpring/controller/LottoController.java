package pl.tomaszKrawczyk.lotttoSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.tomaszKrawczyk.lotttoSpring.panel.Lotto;

/**
 * Created by Tomek Krawczyk on 20.01.2018.
 */@Controller
public class LottoController {

     @GetMapping("/")
    public String List(ModelMap modelMap){

         modelMap.addAttribute("digits", Lotto.gameRandomNumber());

         return "gameLotto";
     }

}
