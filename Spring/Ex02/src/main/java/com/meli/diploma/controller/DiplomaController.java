package com.meli.diploma.controller;

import com.meli.diploma.service.Diploma;
import com.meli.diploma.service.DiplomaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DiplomaController {

    @PostMapping("/")
    public ResponseEntity<String> getDiploma(@RequestBody Diploma payload){
        return ResponseEntity.ok(DiplomaService.obterDiploma(payload));
    }

}
