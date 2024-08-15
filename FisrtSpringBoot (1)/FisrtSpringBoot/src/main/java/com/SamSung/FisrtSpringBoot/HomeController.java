package com.SamSung.FisrtSpringBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    @RequestMapping(value = {"/", "/hello"}, method = RequestMethod.GET)
//    @GetMapping("/hello")
//    @ResponseBody
    public String HelloWorld() {
        return "Hello Java";
    }


    @PostMapping("/")
    public String SayHello() {
        return "Hello Java";
    }
}
