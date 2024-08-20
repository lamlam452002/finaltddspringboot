package org.example.mydemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomController {

    @GetMapping("/hello")
    public String getInfo() {
        return "Index";
    }
}
