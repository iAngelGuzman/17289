package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("holaaaa");
        System.out.println("miyu");
    }

    @RequestMapping("/")
    public String home() {
        System.out.println("Miyu");
        return "miyu";
    }

    @RequestMapping("/hola")
    public String hola() {
        return "hola";
    }

    @RequestMapping("/adios")
    public String adios() {
        return "adios";
    }

    @RequestMapping("/html")
    public String html() {
        String html =
            "<html><h1>Miyu pagina</h1> <p>Pagina prueba spring</p></html> ";
        return html;
    }
}
