package br.com.meli.wave4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
public class Test {
    @GetMapping
    public String pong(){
        return "pong";
    }
}
