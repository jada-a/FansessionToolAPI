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
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/01%20Rust/Prospit/Arittanius.png",
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
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/01%20Rust/Derse/Arun.png",
                    bloodRepository.getReferenceById(1L),
                    aspectRepository.getReferenceById(1L), //Breath
                    swayRepository.getReferenceById(2L)
            );
            Sign arsces = new Sign(
                    "Arsces",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/01%20Rust/Derse/Arsces.png",
                    bloodRepository.getReferenceById(1L),
                    aspectRepository.getReferenceById(2L), //Life
                    swayRepository.getReferenceById(2L)
            );
            Sign arpia = new Sign(
                    "Arpia",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/01%20Rust/Derse/Arpia.png",
                    bloodRepository.getReferenceById(1L),
                    aspectRepository.getReferenceById(3L), //Light
                    swayRepository.getReferenceById(2L)
            );
            Sign aries = new Sign(
                    "Aries",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/01%20Rust/Derse/Aries.png",
                    bloodRepository.getReferenceById(1L),
                    aspectRepository.getReferenceById(4L), //Time
                    swayRepository.getReferenceById(2L)
            );
            Sign aro = new Sign(
                    "Aro",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/01%20Rust/Derse/Aro.png",
                    bloodRepository.getReferenceById(1L),
                    aspectRepository.getReferenceById(5L), //Heart
                    swayRepository.getReferenceById(2L)
            );
            Sign ariborn = new Sign(
                    "Ariborn",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/01%20Rust/Derse/Ariborn.png",
                    bloodRepository.getReferenceById(1L),
                    aspectRepository.getReferenceById(6L), //Rage
                    swayRepository.getReferenceById(2L)
            );
            Sign arcen = new Sign(
                    "Arcen",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/01%20Rust/Derse/Arcen.png",
                    bloodRepository.getReferenceById(1L),
                    aspectRepository.getReferenceById(7L), //Blood
                    swayRepository.getReferenceById(2L)
            );
            Sign armini = new Sign(
                    "Armini",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/01%20Rust/Derse/Armini.png",
                    bloodRepository.getReferenceById(1L),
                    aspectRepository.getReferenceById(8L), //Doom
                    swayRepository.getReferenceById(2L)
            );
            Sign arittarius = new Sign(
                    "Arittarius",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/01%20Rust/Derse/Arittarius.png",
                    bloodRepository.getReferenceById(1L),
                    aspectRepository.getReferenceById(9L), //Void
                    swayRepository.getReferenceById(2L)
            );
            Sign arga = new Sign(
                    "Arga",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/01%20Rust/Derse/Arga.png",
                    bloodRepository.getReferenceById(1L),
                    aspectRepository.getReferenceById(10L), //Space
                    swayRepository.getReferenceById(2L)
            );
            Sign arza = new Sign(
                    "Arza",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/01%20Rust/Derse/Arza.png",
                    bloodRepository.getReferenceById(1L),
                    aspectRepository.getReferenceById(11L), //Mind
                    swayRepository.getReferenceById(2L)
            );
            Sign arrius = new Sign(
                    "Arrius",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/01%20Rust/Derse/Arrius.png",
                    bloodRepository.getReferenceById(1L),
                    aspectRepository.getReferenceById(12L), //Hope
                    swayRepository.getReferenceById(2L)
            );

            signRepository.saveAll(
                    List.of(arun, arsces, arpia, aries, aro, ariborn, arcen, armini, arittarius, arga, arza, arrius)
            );
        };
    }

    @Bean
    CommandLineRunner commandLineRunnerBronze(SignRepository signRepository){
        return args -> {
            //Prospit
            Sign taurus = new Sign(
                    "Taurus",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/02%20Bronze/Prospit/Taurus.png",
                    bloodRepository.getReferenceById(2L),
                    aspectRepository.getReferenceById(1L), //Breath
                    swayRepository.getReferenceById(1L)
            );
            Sign taursci = new Sign(
                    "Taursci",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/02%20Bronze/Prospit/Taursci.png",
                    bloodRepository.getReferenceById(2L),
                    aspectRepository.getReferenceById(2L), //Life
                    swayRepository.getReferenceById(1L)
            );
            Sign taurpio = new Sign(
                    "Taurpio",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/02%20Bronze/Prospit/Taurpio.png",
                    bloodRepository.getReferenceById(2L),
                    aspectRepository.getReferenceById(3L), //Light
                    swayRepository.getReferenceById(1L)
            );
            Sign taurist = new Sign(
                    "Taurist",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/02%20Bronze/Prospit/Taurist.png",
                    bloodRepository.getReferenceById(2L),
                    aspectRepository.getReferenceById(4L), //Time
                    swayRepository.getReferenceById(1L)
            );
            Sign taurlo = new Sign(
                    "Taurlo",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/02%20Bronze/Prospit/Taurlo.png",
                    bloodRepository.getReferenceById(2L),
                    aspectRepository.getReferenceById(5L), //Heart
                    swayRepository.getReferenceById(1L)
            );
            Sign tauricorn = new Sign(
                    "Tauricorn",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/02%20Bronze/Prospit/Tauricorn.png",
                    bloodRepository.getReferenceById(2L),
                    aspectRepository.getReferenceById(6L), //Rage
                    swayRepository.getReferenceById(1L)
            );
            Sign taurcer= new Sign(
                    "Taurcer",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/02%20Bronze/Prospit/Taurcer.png",
                    bloodRepository.getReferenceById(2L),
                    aspectRepository.getReferenceById(7L), //Blood
                    swayRepository.getReferenceById(1L)
            );
            Sign taurmino = new Sign(
                    "Taurmino",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/02%20Bronze/Prospit/Taurmino.png",
                    bloodRepository.getReferenceById(2L),
                    aspectRepository.getReferenceById(8L), //Doom
                    swayRepository.getReferenceById(1L)
            );
            Sign taurittanius = new Sign(
                    "Taurittanius",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/02%20Bronze/Prospit/Taurittanius.png",
                    bloodRepository.getReferenceById(2L),
                    aspectRepository.getReferenceById(9L), //Void
                    swayRepository.getReferenceById(1L)
            );
            Sign taurgo = new Sign(
                    "Taurgo",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/02%20Bronze/Prospit/Taurgo.png",
                    bloodRepository.getReferenceById(2L),
                    aspectRepository.getReferenceById(10L), //Space
                    swayRepository.getReferenceById(1L)
            );
            Sign taurra = new Sign(
                    "Taurra",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/02%20Bronze/Prospit/Taurra.png",
                    bloodRepository.getReferenceById(2L),
                    aspectRepository.getReferenceById(11L), //Mind
                    swayRepository.getReferenceById(1L)
            );
            Sign taurnius = new Sign(
                    "Taurnius",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/02%20Bronze/Prospit/Taurnius.png",
                    bloodRepository.getReferenceById(2L),
                    aspectRepository.getReferenceById(12L), //Hope
                    swayRepository.getReferenceById(1L)
            );

            signRepository.saveAll(
                    List.of(taurus, taursci, taurpio, taurist, taurlo, tauricorn, taurcer, taurmino, taurittanius, taurgo, taurra, taurnius)
            );

            //Derse
            Sign taurun = new Sign(
                    "Taurun",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/02%20Bronze/Derse/Taurun.png",
                    bloodRepository.getReferenceById(2L),
                    aspectRepository.getReferenceById(1L), //Breath
                    swayRepository.getReferenceById(2L)
            );
            Sign taursces = new Sign(
                    "Taursces",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/02%20Bronze/Derse/Taursces.png",
                    bloodRepository.getReferenceById(2L),
                    aspectRepository.getReferenceById(2L), //Life
                    swayRepository.getReferenceById(2L)
            );
            Sign taurpia = new Sign(
                    "Taurpia",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/02%20Bronze/Derse/Taurpia.png",
                    bloodRepository.getReferenceById(2L),
                    aspectRepository.getReferenceById(3L), //Light
                    swayRepository.getReferenceById(2L)
            );
            Sign tauries = new Sign(
                    "Tauries",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/02%20Bronze/Derse/Tauries.png",
                    bloodRepository.getReferenceById(2L),
                    aspectRepository.getReferenceById(4L), //Time
                    swayRepository.getReferenceById(2L)
            );
            Sign tauro = new Sign(
                    "Tauro",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/02%20Bronze/Derse/Tauro.png",
                    bloodRepository.getReferenceById(2L),
                    aspectRepository.getReferenceById(5L), //Heart
                    swayRepository.getReferenceById(2L)
            );
            Sign tauriborn = new Sign(
                    "Tauriborn",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/02%20Bronze/Derse/Tauriborn.png",
                    bloodRepository.getReferenceById(2L),
                    aspectRepository.getReferenceById(6L), //Rage
                    swayRepository.getReferenceById(2L)
            );
            Sign taurcen = new Sign(
                    "Taurcen",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/02%20Bronze/Derse/Taurcen.png",
                    bloodRepository.getReferenceById(2L),
                    aspectRepository.getReferenceById(7L), //Blood
                    swayRepository.getReferenceById(2L)
            );
            Sign taurmini = new Sign(
                    "Taurmini",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/02%20Bronze/Derse/Taurmini.png",
                    bloodRepository.getReferenceById(2L),
                    aspectRepository.getReferenceById(8L), //Doom
                    swayRepository.getReferenceById(2L)
            );
            Sign taurittarius = new Sign(
                    "Taurittarius",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/02%20Bronze/Derse/Taurttarius.png",
                    bloodRepository.getReferenceById(2L),
                    aspectRepository.getReferenceById(9L), //Void
                    swayRepository.getReferenceById(2L)
            );
            Sign taurga = new Sign(
                    "Taurga",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/02%20Bronze/Derse/Taurga.png",
                    bloodRepository.getReferenceById(2L),
                    aspectRepository.getReferenceById(10L), //Space
                    swayRepository.getReferenceById(2L)
            );
            Sign taurza = new Sign(
                    "Taurza",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/02%20Bronze/Derse/Taurza.png",
                    bloodRepository.getReferenceById(2L),
                    aspectRepository.getReferenceById(11L), //Mind
                    swayRepository.getReferenceById(2L)
            );
            Sign taurrius = new Sign(
                    "Taurrius",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/02%20Bronze/Derse/Taurrius.png",
                    bloodRepository.getReferenceById(2L),
                    aspectRepository.getReferenceById(12L), //Hope
                    swayRepository.getReferenceById(2L)
            );

            signRepository.saveAll(
                    List.of(taurun, taursces, taurpia, tauries, tauro, tauriborn, taurcen, taurmini, taurittarius, taurga, taurza, taurrius)
            );
        };
    }

}
