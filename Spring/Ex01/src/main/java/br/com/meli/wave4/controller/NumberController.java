package br.com.meli.wave4.controller;

import br.com.meli.wave4.service.RomanConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/convert")
public class NumberController {

    @GetMapping("/{number}")
    public String convert(@PathVariable int number){
        return  RomanConverter.Convert(number);
    }
}
