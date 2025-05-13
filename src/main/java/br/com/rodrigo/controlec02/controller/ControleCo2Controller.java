package br.com.rodrigo.controlec02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControleCo2Controller {
    @GetMapping("/co2")
    public String sayhello() {
        return "Seja bem-vindo ao controlador de CO2!";
    }
}
