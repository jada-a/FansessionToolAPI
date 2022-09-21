package com.example.fansessiontool.sign;

import com.example.fansessiontool.aspect.AspectRepository;
import com.example.fansessiontool.blood.BloodRepository;
import com.example.fansessiontool.lunarSway.LunarSwayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SignConfig {
    final BloodRepository bloodRepository;
    final AspectRepository aspectRepository;
    final LunarSwayRepository swayRepository;

    @Autowired
    public SignConfig(BloodRepository bloodRepository, AspectRepository aspectRepository, LunarSwayRepository swayRepository) {
        this.bloodRepository = bloodRepository;
        this.aspectRepository = aspectRepository;
        this.swayRepository = swayRepository;
    }

    @Bean
    CommandLineRunner commandLineRunner5(SignRepository signRepository){
        return args -> {
            Sign arus = new Sign(
                    "Arus",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/01%20Rust/Derse/Aries.png",
                    bloodRepository.getReferenceById(1L),
                    aspectRepository.getReferenceById(1L),
                    swayRepository.getReferenceById(1L)
            );
            Sign arsci = new Sign(
                    "Arsci",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/01%20Rust/Derse/Aries.png",
                    bloodRepository.getReferenceById(1L),
                    aspectRepository.getReferenceById(2L),
                    swayRepository.getReferenceById(1L)
            );
            Sign aries = new Sign(
                    "Aries",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/01%20Rust/Derse/Aries.png",
                    bloodRepository.getReferenceById(1L),
                    aspectRepository.getReferenceById(4L),
                    swayRepository.getReferenceById(2L)
            );
            signRepository.saveAll(
                    List.of(arus, arsci, aries)
            );
        };
    }
}
