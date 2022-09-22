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
    CommandLineRunner commandLineRunnerRust(SignRepository signRepository){
        return args -> {
            //Prospit
            Sign arus = new Sign(
                    "Arus",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/01%20Rust/Prospit/Arus.png",
                    bloodRepository.getReferenceById(1L),
                    aspectRepository.getReferenceById(1L), //Breath
                    swayRepository.getReferenceById(1L)
            );
            Sign arsci = new Sign(
                    "Arsci",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/01%20Rust/Prospit/Arsci.png",
                    bloodRepository.getReferenceById(1L),
                    aspectRepository.getReferenceById(2L), //Life
                    swayRepository.getReferenceById(1L)
            );
            Sign arpio = new Sign(
                    "Arpio",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/01%20Rust/Prospit/Arpio.png",
                    bloodRepository.getReferenceById(1L),
                    aspectRepository.getReferenceById(3L), //Light
                    swayRepository.getReferenceById(1L)
            );
            Sign arist = new Sign(
                    "Arist",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/01%20Rust/Prospit/Arist.png",
                    bloodRepository.getReferenceById(1L),
                    aspectRepository.getReferenceById(4L), //Time
                    swayRepository.getReferenceById(1L)
            );
            Sign arlo = new Sign(
                    "Arlo",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/01%20Rust/Prospit/Arlo.png",
                    bloodRepository.getReferenceById(1L),
                    aspectRepository.getReferenceById(5L), //Heart
                    swayRepository.getReferenceById(1L)
            );
            Sign aricorn = new Sign(
                    "Aricorn",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/01%20Rust/Prospit/Aricorn.png",
                    bloodRepository.getReferenceById(1L),
                    aspectRepository.getReferenceById(6L), //Rage
                    swayRepository.getReferenceById(1L)
            );
            Sign arcer= new Sign(
                    "Arcer",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/01%20Rust/Prospit/Arcer.png",
                    bloodRepository.getReferenceById(1L),
                    aspectRepository.getReferenceById(7L), //Blood
                    swayRepository.getReferenceById(1L)
            );
            Sign armino = new Sign(
                    "Armino",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/01%20Rust/Prospit/Armino.png",
                    bloodRepository.getReferenceById(1L),
                    aspectRepository.getReferenceById(8L), //Doom
                    swayRepository.getReferenceById(1L)
            );
            Sign arittanius = new Sign(
                    "Arittanius",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/01%20Rust/Prospit/Arttanius.png",
                    bloodRepository.getReferenceById(1L),
                    aspectRepository.getReferenceById(9L), //Void
                    swayRepository.getReferenceById(1L)
            );
            Sign argo = new Sign(
                    "Argo",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/01%20Rust/Prospit/Argo.png",
                    bloodRepository.getReferenceById(1L),
                    aspectRepository.getReferenceById(10L), //Space
                    swayRepository.getReferenceById(1L)
            );
            Sign arra = new Sign(
                    "Arra",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/01%20Rust/Prospit/Arra.png",
                    bloodRepository.getReferenceById(1L),
                    aspectRepository.getReferenceById(11L), //Mind
                    swayRepository.getReferenceById(1L)
            );
            Sign arnius = new Sign(
                    "Arnius",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/01%20Rust/Prospit/Arnius.png",
                    bloodRepository.getReferenceById(1L),
                    aspectRepository.getReferenceById(12L), //Hope
                    swayRepository.getReferenceById(1L)
            );

            signRepository.saveAll(
                    List.of(arus, arsci, arpio, arist, arlo, aricorn, arcer, armino, arittanius, argo, arra, arnius)
            );

            //Derse
            Sign arun = new Sign(
                    "Arun",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/01%20Rust/Prospit/Arun.png",
                    bloodRepository.getReferenceById(1L),
                    aspectRepository.getReferenceById(1L), //Breath
                    swayRepository.getReferenceById(2L)
            );
            Sign arsces = new Sign(
                    "Arsces",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/01%20Rust/Prospit/Arsces.png",
                    bloodRepository.getReferenceById(1L),
                    aspectRepository.getReferenceById(2L), //Life
                    swayRepository.getReferenceById(2L)
            );
            Sign arpia = new Sign(
                    "Arpia",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/01%20Rust/Prospit/Arpia.png",
                    bloodRepository.getReferenceById(1L),
                    aspectRepository.getReferenceById(3L), //Light
                    swayRepository.getReferenceById(2L)
            );
            Sign aries = new Sign(
                    "Aries",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/01%20Rust/Prospit/Aries.png",
                    bloodRepository.getReferenceById(1L),
                    aspectRepository.getReferenceById(4L), //Time
                    swayRepository.getReferenceById(2L)
            );
            Sign aro = new Sign(
                    "Aro",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/01%20Rust/Prospit/Aro.png",
                    bloodRepository.getReferenceById(1L),
                    aspectRepository.getReferenceById(5L), //Heart
                    swayRepository.getReferenceById(2L)
            );
            Sign ariborn = new Sign(
                    "Ariborn",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/01%20Rust/Prospit/Ariborn.png",
                    bloodRepository.getReferenceById(1L),
                    aspectRepository.getReferenceById(6L), //Rage
                    swayRepository.getReferenceById(2L)
            );
            Sign arcen = new Sign(
                    "Arcen",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/01%20Rust/Prospit/Arcen.png",
                    bloodRepository.getReferenceById(1L),
                    aspectRepository.getReferenceById(7L), //Blood
                    swayRepository.getReferenceById(2L)
            );
            Sign armini = new Sign(
                    "Armini",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/01%20Rust/Prospit/Armini.png",
                    bloodRepository.getReferenceById(1L),
                    aspectRepository.getReferenceById(8L), //Doom
                    swayRepository.getReferenceById(2L)
            );
            Sign arittarius = new Sign(
                    "Arittarius",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/01%20Rust/Prospit/Arttarius.png",
                    bloodRepository.getReferenceById(1L),
                    aspectRepository.getReferenceById(9L), //Void
                    swayRepository.getReferenceById(2L)
            );
            Sign arga = new Sign(
                    "Arga",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/01%20Rust/Prospit/Arga.png",
                    bloodRepository.getReferenceById(1L),
                    aspectRepository.getReferenceById(10L), //Space
                    swayRepository.getReferenceById(2L)
            );
            Sign arza = new Sign(
                    "Arza",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/01%20Rust/Prospit/Arza.png",
                    bloodRepository.getReferenceById(1L),
                    aspectRepository.getReferenceById(11L), //Mind
                    swayRepository.getReferenceById(2L)
            );
            Sign arrius = new Sign(
                    "Arrius",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/01%20Rust/Prospit/Arrius.png",
                    bloodRepository.getReferenceById(1L),
                    aspectRepository.getReferenceById(12L), //Hope
                    swayRepository.getReferenceById(2L)
            );

            signRepository.saveAll(
                    List.of(arun, arsces, arpia, aries, aro, ariborn, arcen, armini, arittarius, arga, arza, arrius)
            );
        };
    }
}
