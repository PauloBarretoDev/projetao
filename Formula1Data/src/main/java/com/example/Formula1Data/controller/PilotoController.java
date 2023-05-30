package com.example.Formula1Data.controller;

import com.example.Formula1Data.Piloto.Piloto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("piloto")
public class PilotoController {
    @GetMapping
    public void getAll(){

        Piloto piloto;
    }
}
