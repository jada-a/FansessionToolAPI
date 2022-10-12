package com.example.fansessiontool.sign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/sign")
public class SignController {

    private final SignService signService;

    @Autowired
    public SignController(SignService signService) {
        this.signService = signService;
    }

    @GetMapping
    public List<Sign> getSigns(){
        return signService.getSigns();
    }

    @GetMapping("/{name}")
    public Sign getSign(@PathVariable String name){
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        return signService.getSign(name);
    }
    @GetMapping("/blood/{color}")
    public List<Sign> getSignsByBloodColor(@PathVariable String color){
        return signService.getSignsByBloodColor(color);
    }
    @GetMapping("/moon/{moon}")
    public List<Sign> getSignsByLunarSway(@PathVariable String moon){
        return signService.getSignsByLunarSway(moon);
    }
 }
