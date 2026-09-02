package com.example.miprimeraaplicacionweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hola desde mi primer servidor";
    }

    @GetMapping("/saludo")
    public String saludo(@RequestParam String nombre) {
        return "Hola desde el servidor de " + nombre;
    }

    @PostMapping("/mensaje")
    public String mensaje(@RequestBody String texto) {
        return "Mensaje recibido: " + texto;
    }
}