package com.pluralsight.EventTracker.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "forward:index.jsp";
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
