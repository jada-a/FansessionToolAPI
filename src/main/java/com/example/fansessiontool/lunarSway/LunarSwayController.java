package com.example.fansessiontool.lunarSway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/moon")
public class LunarSwayController {
    private final LunarSwayService lunarService;

    @Autowired
    public LunarSwayController(LunarSwayService lunarService) {
        this.lunarService = lunarService;
    }

    @GetMapping
    public List<LunarSway> getLunarSways(){
        return lunarService.getLunarSways();
    }
}
