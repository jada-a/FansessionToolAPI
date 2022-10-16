package com.example.fansessiontool.aspect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AspectService {
    private final AspectRepository aspectRepository;

    @Autowired
    public AspectService(AspectRepository aspectRepository) {
        this.aspectRepository = aspectRepository;
    }

    public List<Aspect> getAspects(){
        return aspectRepository.findAll();
    }
    public Aspect getAspect(String name){
        return aspectRepository.findByNameIgnoreCase(name);
    }
}
