package com.alexboriskin.chucknorris.controllers;

import com.alexboriskin.chucknorris.services.JokeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RootController {

    private JokeServiceImpl jokeService;

    @Autowired
    public RootController(JokeServiceImpl jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String doJoke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        return "joke";
    }
}
