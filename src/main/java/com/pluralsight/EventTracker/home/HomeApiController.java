package com.pluralsight.EventTracker.home;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/")
public class HomeApiController {

    @Value("${app.version}")
    private String version;

    @GetMapping
    public Map<String,Object> home(){
        var map  = new HashMap<String,Object>();
        map.put("app-version",version);
        return map;
    }
}
