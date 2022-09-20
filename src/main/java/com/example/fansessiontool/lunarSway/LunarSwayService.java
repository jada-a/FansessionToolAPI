package com.example.fansessiontool.lunarSway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LunarSwayService {
    private final LunarSwayRepository lunarSwayRepository;

    @Autowired
    public LunarSwayService(LunarSwayRepository lunarSwayRepository) {
        this.lunarSwayRepository = lunarSwayRepository;
    }

    public List<LunarSway> getLunarSways(){
        return lunarSwayRepository.findAll();
    }
}
