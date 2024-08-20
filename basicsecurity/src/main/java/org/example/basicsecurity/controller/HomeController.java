package org.example.basicsecurity.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String Home() {
        return "welcome";
    }

    @GetMapping("/about")
    public String about() {
        return "welcome";
    }
}
