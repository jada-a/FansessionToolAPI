package com.example.fansessiontool.sign;

import com.example.fansessiontool.blood.BloodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SignConfig {
    final BloodRepository bloodRepository;

    @Autowired
    public SignConfig(BloodRepository bloodRepository) {
        this.bloodRepository = bloodRepository;
    }

    @Bean
    CommandLineRunner commandLineRunner5(SignRepository signRepository){
        return args -> {
            Sign aries = new Sign(
                    "Aries",
                    bloodRepository.getReferenceById(1L)
            );
            signRepository.save(aries);
        };
    }
}
