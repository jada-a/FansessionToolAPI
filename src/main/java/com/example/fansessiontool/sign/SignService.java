package com.example.fansessiontool.sign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SignService {
    private final SignRepository signRepository;

    @Autowired
    public SignService(SignRepository signRepository) {
        this.signRepository = signRepository;
    }

    public List<Sign> getSigns(){
        return signRepository.findAll();
    }
}
