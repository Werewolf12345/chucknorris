package com.alexboriskin.chucknorris.controllers;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RootController {

    @RequestMapping({"/", ""})
    public String doJoke(Model model) {
        model.addAttribute("joke", new ChuckNorrisQuotes().getRandomQuote());
        return "joke";
    }
}
