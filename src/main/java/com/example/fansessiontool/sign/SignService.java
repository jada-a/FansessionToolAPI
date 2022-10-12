package com.example.fansessiontool.sign;

import com.example.fansessiontool.blood.Blood;
import com.example.fansessiontool.blood.BloodRepository;
import com.example.fansessiontool.lunarSway.LunarSway;
import com.example.fansessiontool.lunarSway.LunarSwayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SignService {
    private final SignRepository signRepository;
    private final BloodRepository bloodRepository;
    private final LunarSwayRepository lunarSwayRepository;

    @Autowired
    public SignService(SignRepository signRepository, BloodRepository bloodRepository, LunarSwayRepository lunarSwayRepository) {
        this.signRepository = signRepository;
        this.bloodRepository = bloodRepository;
        this.lunarSwayRepository = lunarSwayRepository;
    }

    public List<Sign> getSigns(){
        return signRepository.findAll();
    }

    public Sign getSign(String name){
        return signRepository.findByName(name);
    }

    public List<Sign> getSignsByBloodColor(String color){
        Blood bloodColor = bloodRepository.findByColorIgnoreCase(color);
        return signRepository.findByBloodColor(bloodColor);
    }
    public List<Sign> getSignsByLunarSway(String moon){
        LunarSway lunarSway = lunarSwayRepository.findByNameIgnoreCase(moon);
        return signRepository.findByLunarSway(lunarSway);
    }
}
