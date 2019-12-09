package com.pluralsight.conferencedemo.controllers;

import com.pluralsight.conferencedemo.models.Session;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping("/api/v1")
public class HomeController {

    @Value("${app.version}")
    private String version;

    @GetMapping
    public Map<String,Object> Info(){
        var map  = new HashMap<String,Object>();
        map.put("app-version",version);
        return map;
    }
}
