package com.example.fansessiontool.sign;

import com.example.fansessiontool.blood.Blood;
import com.example.fansessiontool.blood.BloodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SignService {
    private final SignRepository signRepository;
    private final BloodRepository bloodRepository;

    @Autowired
    public SignService(SignRepository signRepository, BloodRepository bloodRepository) {
        this.signRepository = signRepository;
        this.bloodRepository = bloodRepository;
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
}
