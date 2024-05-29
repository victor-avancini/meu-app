package com.example.meu_app;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class PrimeiraRota {
    @GetMapping("/primeira_rota")
    public String read(){
        return "Minha primeira rota GET!!!!!!";
    }
}
