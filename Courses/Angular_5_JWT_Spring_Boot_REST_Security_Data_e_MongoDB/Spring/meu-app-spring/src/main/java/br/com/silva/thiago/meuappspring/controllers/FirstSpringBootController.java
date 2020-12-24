package br.com.silva.thiago.meuappspring.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstSpringBootController {

    @RequestMapping("/show")
    public String showTex() {
        return "Hello planet!!!\n this is my Sprig Boot application";
    }

    @RequestMapping("/")
    public String index() {
        return "Index page";
    }

}
