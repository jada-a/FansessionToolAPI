package com.example.fansessiontool.aspect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/aspect")
public class AspectController {
    private final AspectService aspectService;

    @Autowired
    public AspectController(AspectService aspectService) {
        this.aspectService = aspectService;
    }

    @GetMapping
    public List<Aspect> getAspects(){
        return aspectService.getAspects();
    }

    @GetMapping("/{name}")
    public Aspect getAspect(@PathVariable String name){
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        return aspectService.getAspect(name);
    }
}
