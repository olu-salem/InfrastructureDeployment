package com.abhishek.minecraftserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class MinecraftServerApplication {

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "Welcome to Minecraft Server");
        model.addAttribute("msg", "This is a Minecraft server deployed using Jenkins, Maven, SonarQube, Nexus, and Docker");
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(MinecraftServerApplication.class, args);
    }

}
