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
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/02%20Bronze/Derse/Taurittarius.png",
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

    @Bean
    CommandLineRunner commandLineRunnerGold(SignRepository signRepository){
        return args -> {
            //Prospit
            Sign gemus = new Sign(
                    "Gemus",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/03%20Gold/Prospit/Gemus.png",
                    bloodRepository.getReferenceById(3L),
                    aspectRepository.getReferenceById(1L), //Breath
                    swayRepository.getReferenceById(1L)
            );
            Sign gemsci = new Sign(
                    "Gemsci",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/03%20Gold/Prospit/Gemsci.png",
                    bloodRepository.getReferenceById(3L),
                    aspectRepository.getReferenceById(2L), //Life
                    swayRepository.getReferenceById(1L)
            );
            Sign gempio = new Sign(
                    "Gempio",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/03%20Gold/Prospit/Gempio.png",
                    bloodRepository.getReferenceById(3L),
                    aspectRepository.getReferenceById(3L), //Light
                    swayRepository.getReferenceById(1L)
            );
            Sign gemrist = new Sign(
                    "Gemist",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/03%20Gold/Prospit/Gemrist.png",
                    bloodRepository.getReferenceById(3L),
                    aspectRepository.getReferenceById(4L), //Time
                    swayRepository.getReferenceById(1L)
            );
            Sign gemlo = new Sign(
                    "Gemlo",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/03%20Gold/Prospit/Gemlo.png",
                    bloodRepository.getReferenceById(3L),
                    aspectRepository.getReferenceById(5L), //Heart
                    swayRepository.getReferenceById(1L)
            );
            Sign gemicorn = new Sign(
                    "Gemicorn",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/03%20Gold/Prospit/Gemicorn.png",
                    bloodRepository.getReferenceById(3L),
                    aspectRepository.getReferenceById(6L), //Rage
                    swayRepository.getReferenceById(1L)
            );
            Sign gemcer= new Sign(
                    "Gemcer",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/03%20Gold/Prospit/Gemcer.png",
                    bloodRepository.getReferenceById(3L),
                    aspectRepository.getReferenceById(7L), //Blood
                    swayRepository.getReferenceById(1L)
            );
            Sign gemino = new Sign(
                    "Gemino",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/03%20Gold/Prospit/Gemino.png",
                    bloodRepository.getReferenceById(3L),
                    aspectRepository.getReferenceById(8L), //Doom
                    swayRepository.getReferenceById(1L)
            );
            Sign gemittanius = new Sign(
                    "Gemittanius",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/03%20Gold/Prospit/Gemittanius.png",
                    bloodRepository.getReferenceById(3L),
                    aspectRepository.getReferenceById(9L), //Void
                    swayRepository.getReferenceById(1L)
            );
            Sign gemgo = new Sign(
                    "Gemgo",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/03%20Gold/Prospit/Gemgo.png",
                    bloodRepository.getReferenceById(3L),
                    aspectRepository.getReferenceById(10L), //Space
                    swayRepository.getReferenceById(1L)
            );
            Sign gemra = new Sign(
                    "Gemra",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/03%20Gold/Prospit/Gemra.png",
                    bloodRepository.getReferenceById(3L),
                    aspectRepository.getReferenceById(11L), //Mind
                    swayRepository.getReferenceById(1L)
            );
            Sign gemnius = new Sign(
                    "Gemnius",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/03%20Gold/Prospit/Gemnius.png",
                    bloodRepository.getReferenceById(3L),
                    aspectRepository.getReferenceById(12L), //Hope
                    swayRepository.getReferenceById(1L)
            );

            signRepository.saveAll(
                    List.of(gemus, gemsci, gempio, gemrist, gemlo, gemicorn, gemcer, gemino, gemittanius, gemgo, gemra, gemnius)
            );
            //Derse
            Sign gemun = new Sign(
                    "Gemun",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/03%20Gold/Derse/Gemun.png",
                    bloodRepository.getReferenceById(3L),
                    aspectRepository.getReferenceById(1L), //Breath
                    swayRepository.getReferenceById(2L)
            );
            Sign gemsces = new Sign(
                    "Gemsces",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/03%20Gold/Derse/Gemsces.png",
                    bloodRepository.getReferenceById(3L),
                    aspectRepository.getReferenceById(2L), //Life
                    swayRepository.getReferenceById(2L)
            );
            Sign gempia = new Sign(
                    "Gempia",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/03%20Gold/Derse/Gempia.png",
                    bloodRepository.getReferenceById(3L),
                    aspectRepository.getReferenceById(3L), //Light
                    swayRepository.getReferenceById(2L)
            );
            Sign gemries = new Sign(
                    "Gemries",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/03%20Gold/Derse/Gemries.png",
                    bloodRepository.getReferenceById(3L),
                    aspectRepository.getReferenceById(4L), //Time
                    swayRepository.getReferenceById(2L)
            );
            Sign gemo = new Sign(
                    "Gemo",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/03%20Gold/Derse/Gemo.png",
                    bloodRepository.getReferenceById(3L),
                    aspectRepository.getReferenceById(5L), //Heart
                    swayRepository.getReferenceById(2L)
            );
            Sign gemiborn = new Sign(
                    "Gemiborn",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/03%20Gold/Derse/Gemiborn.png",
                    bloodRepository.getReferenceById(3L),
                    aspectRepository.getReferenceById(6L), //Rage
                    swayRepository.getReferenceById(2L)
            );
            Sign gemcen = new Sign(
                    "Gemcen",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/03%20Gold/Derse/Gemcen.png",
                    bloodRepository.getReferenceById(3L),
                    aspectRepository.getReferenceById(7L), //Blood
                    swayRepository.getReferenceById(2L)
            );
            Sign gemini = new Sign(
                    "Gemini",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/03%20Gold/Derse/Gemini.png",
                    bloodRepository.getReferenceById(3L),
                    aspectRepository.getReferenceById(8L), //Doom
                    swayRepository.getReferenceById(2L)
            );
            Sign gemittarius = new Sign(
                    "Gemittarius",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/03%20Gold/Derse/Gemittarius.png",
                    bloodRepository.getReferenceById(3L),
                    aspectRepository.getReferenceById(9L), //Void
                    swayRepository.getReferenceById(2L)
            );
            Sign gemga = new Sign(
                    "Gemga",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/03%20Gold/Derse/Gemga.png",
                    bloodRepository.getReferenceById(3L),
                    aspectRepository.getReferenceById(10L), //Space
                    swayRepository.getReferenceById(2L)
            );
            Sign gemza = new Sign(
                    "Gemza",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/03%20Gold/Derse/Gemza.png",
                    bloodRepository.getReferenceById(3L),
                    aspectRepository.getReferenceById(11L), //Mind
                    swayRepository.getReferenceById(2L)
            );
            Sign gemrius = new Sign(
                    "Gemrius",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/03%20Gold/Derse/Gemrius.png",
                    bloodRepository.getReferenceById(3L),
                    aspectRepository.getReferenceById(12L), //Hope
                    swayRepository.getReferenceById(2L)
            );

            signRepository.saveAll(
                    List.of(gemun, gemsces, gempia, gemries, gemo, gemiborn, gemcen, gemini, gemittarius, gemga, gemza, gemrius)
            );
        };
    }

    @Bean
    CommandLineRunner commandLineRunnerLime(SignRepository signRepository){
        return args -> {
            //Prospit
            Sign canus = new Sign(
                    "Canus",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/04%20Lime/Prospit/Canus.png",
                    bloodRepository.getReferenceById(4L),
                    aspectRepository.getReferenceById(1L), //Breath
                    swayRepository.getReferenceById(1L)
            );
            Sign cansci = new Sign(
                    "Cansci",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/04%20Lime/Prospit/Cansci.png",
                    bloodRepository.getReferenceById(4L),
                    aspectRepository.getReferenceById(2L), //Life
                    swayRepository.getReferenceById(1L)
            );
            Sign canpio = new Sign(
                    "Canpio",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/04%20Lime/Prospit/Canpio.png",
                    bloodRepository.getReferenceById(4L),
                    aspectRepository.getReferenceById(3L), //Light
                    swayRepository.getReferenceById(1L)
            );
            Sign canrist = new Sign(
                    "Canrist",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/04%20Lime/Prospit/Canrist.png",
                    bloodRepository.getReferenceById(4L),
                    aspectRepository.getReferenceById(4L), //Time
                    swayRepository.getReferenceById(1L)
            );
            Sign canlo = new Sign(
                    "Canlo",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/04%20Lime/Prospit/Canlo.png",
                    bloodRepository.getReferenceById(4L),
                    aspectRepository.getReferenceById(5L), //Heart
                    swayRepository.getReferenceById(1L)
            );
            Sign canicorn = new Sign(
                    "Canicorn",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/04%20Lime/Prospit/Canicorn.png",
                    bloodRepository.getReferenceById(4L),
                    aspectRepository.getReferenceById(6L), //Rage
                    swayRepository.getReferenceById(1L)
            );
            Sign cancer= new Sign(
                    "Cancer",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/04%20Lime/Prospit/Cancer.png",
                    bloodRepository.getReferenceById(4L),
                    aspectRepository.getReferenceById(7L), //Blood
                    swayRepository.getReferenceById(1L)
            );
            Sign camino = new Sign(
                    "Camino",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/04%20Lime/Prospit/Camino.png",
                    bloodRepository.getReferenceById(4L),
                    aspectRepository.getReferenceById(8L), //Doom
                    swayRepository.getReferenceById(1L)
            );
            Sign canittanius = new Sign(
                    "Canittanius",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/04%20Lime/Prospit/Canittanius.png",
                    bloodRepository.getReferenceById(4L),
                    aspectRepository.getReferenceById(9L), //Void
                    swayRepository.getReferenceById(1L)
            );
            Sign cango = new Sign(
                    "Cango",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/04%20Lime/Prospit/Cango.png",
                    bloodRepository.getReferenceById(4L),
                    aspectRepository.getReferenceById(10L), //Space
                    swayRepository.getReferenceById(1L)
            );
            Sign canra = new Sign(
                    "Canra",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/04%20Lime/Prospit/Canra.png",
                    bloodRepository.getReferenceById(4L),
                    aspectRepository.getReferenceById(11L), //Mind
                    swayRepository.getReferenceById(1L)
            );
            Sign cannius = new Sign(
                    "Cannius",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/04%20Lime/Prospit/Cannius.png",
                    bloodRepository.getReferenceById(4L),
                    aspectRepository.getReferenceById(12L), //Hope
                    swayRepository.getReferenceById(1L)
            );

            signRepository.saveAll(
                    List.of(canus, cansci, canpio, canrist, canlo, canicorn, cancer, camino, canittanius, cango, canra, cannius)
            );

            //Derse
            Sign canun = new Sign(
                    "Canun",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/04%20Lime/Derse/Canun.png",
                    bloodRepository.getReferenceById(4L),
                    aspectRepository.getReferenceById(1L), //Breath
                    swayRepository.getReferenceById(2L)
            );
            Sign cansces = new Sign(
                    "Cansces",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/04%20Lime/Derse/Cansces.png",
                    bloodRepository.getReferenceById(4L),
                    aspectRepository.getReferenceById(2L), //Life
                    swayRepository.getReferenceById(2L)
            );
            Sign canpia = new Sign(
                    "Canpia",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/04%20Lime/Derse/Canpia.png",
                    bloodRepository.getReferenceById(4L),
                    aspectRepository.getReferenceById(3L), //Light
                    swayRepository.getReferenceById(2L)
            );
            Sign canries = new Sign(
                    "Canries",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/04%20Lime/Derse/Canries.png",
                    bloodRepository.getReferenceById(4L),
                    aspectRepository.getReferenceById(4L), //Time
                    swayRepository.getReferenceById(2L)
            );
            Sign cano = new Sign(
                    "Cano",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/04%20Lime/Derse/Cano.png",
                    bloodRepository.getReferenceById(4L),
                    aspectRepository.getReferenceById(5L), //Heart
                    swayRepository.getReferenceById(2L)
            );
            Sign caniborn = new Sign(
                    "Caniborn",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/04%20Lime/Derse/Caniborn.png",
                    bloodRepository.getReferenceById(4L),
                    aspectRepository.getReferenceById(6L), //Rage
                    swayRepository.getReferenceById(2L)
            );
            Sign cancen = new Sign(
                    "Cancen",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/04%20Lime/Derse/Cancen.png",
                    bloodRepository.getReferenceById(4L),
                    aspectRepository.getReferenceById(7L), //Blood
                    swayRepository.getReferenceById(2L)
            );
            Sign camini = new Sign(
                    "Camini",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/04%20Lime/Derse/Camini.png",
                    bloodRepository.getReferenceById(4L),
                    aspectRepository.getReferenceById(8L), //Doom
                    swayRepository.getReferenceById(2L)
            );
            Sign canittarius = new Sign(
                    "Canittarius",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/04%20Lime/Derse/Canittarius.png",
                    bloodRepository.getReferenceById(4L),
                    aspectRepository.getReferenceById(9L), //Void
                    swayRepository.getReferenceById(2L)
            );
            Sign canga = new Sign(
                    "Canga",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/04%20Lime/Derse/Canga.png",
                    bloodRepository.getReferenceById(4L),
                    aspectRepository.getReferenceById(10L), //Space
                    swayRepository.getReferenceById(2L)
            );
            Sign canza = new Sign(
                    "Canza",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/04%20Lime/Derse/Canza.png",
                    bloodRepository.getReferenceById(4L),
                    aspectRepository.getReferenceById(11L), //Mind
                    swayRepository.getReferenceById(2L)
            );
            Sign canrius = new Sign(
                    "Canrius",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/04%20Lime/Derse/Canrius.png",
                    bloodRepository.getReferenceById(4L),
                    aspectRepository.getReferenceById(12L), //Hope
                    swayRepository.getReferenceById(2L)
            );

            signRepository.saveAll(
                    List.of(canun, cansces, canpia, canries, cano, caniborn, cancen, camini, canittarius, canga, canza, canrius)
            );
        };
    }

    @Bean
    CommandLineRunner commandLineRunnerOlive(SignRepository signRepository){
        return args -> {
            //Prospit
            Sign p1 = new Sign(
                    "Leus",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/05%20Olive/Prospit/Leus.png",
                    bloodRepository.getReferenceById(5L),
                    aspectRepository.getReferenceById(1L), //Breath
                    swayRepository.getReferenceById(1L)
            );
            Sign p2 = new Sign(
                    "Lesci",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/05%20Olive/Prospit/Lesci.png",
                    bloodRepository.getReferenceById(5L),
                    aspectRepository.getReferenceById(2L), //Life
                    swayRepository.getReferenceById(1L)
            );
            Sign p3 = new Sign(
                    "Lepio",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/05%20Olive/Prospit/Lepio.png",
                    bloodRepository.getReferenceById(5L),
                    aspectRepository.getReferenceById(3L), //Light
                    swayRepository.getReferenceById(1L)
            );
            Sign p4 = new Sign(
                    "Lerist",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/05%20Olive/Prospit/Lerist.png",
                    bloodRepository.getReferenceById(5L),
                    aspectRepository.getReferenceById(4L), //Time
                    swayRepository.getReferenceById(1L)
            );
            Sign p5 = new Sign(
                    "Lelo",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/05%20Olive/Prospit/Lelo.png",
                    bloodRepository.getReferenceById(5L),
                    aspectRepository.getReferenceById(5L), //Heart
                    swayRepository.getReferenceById(1L)
            );
            Sign p6 = new Sign(
                    "Leicorn",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/05%20Olive/Prospit/Leicorn.png",
                    bloodRepository.getReferenceById(5L),
                    aspectRepository.getReferenceById(6L), //Rage
                    swayRepository.getReferenceById(1L)
            );
            Sign p7 = new Sign(
                    "Lecer",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/05%20Olive/Prospit/Lecer.png",
                    bloodRepository.getReferenceById(5L),
                    aspectRepository.getReferenceById(7L), //Blood
                    swayRepository.getReferenceById(1L)
            );
            Sign p8 = new Sign(
                    "Lemino",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/05%20Olive/Prospit/Lemino.png",
                    bloodRepository.getReferenceById(5L),
                    aspectRepository.getReferenceById(8L), //Doom
                    swayRepository.getReferenceById(1L)
            );
            Sign p9 = new Sign(
                    "Leittanius",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/05%20Olive/Prospit/Leittanius.png",
                    bloodRepository.getReferenceById(5L),
                    aspectRepository.getReferenceById(9L), //Void
                    swayRepository.getReferenceById(1L)
            );
            Sign p10 = new Sign(
                    "Lego",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/05%20Olive/Prospit/Lego.png",
                    bloodRepository.getReferenceById(5L),
                    aspectRepository.getReferenceById(10L), //Space
                    swayRepository.getReferenceById(1L)
            );
            Sign p11 = new Sign(
                    "Lera",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/05%20Olive/Prospit/Lera.png",
                    bloodRepository.getReferenceById(5L),
                    aspectRepository.getReferenceById(11L), //Mind
                    swayRepository.getReferenceById(1L)
            );
            Sign p12 = new Sign(
                    "Lenius",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/05%20Olive/Prospit/Lenius.png",
                    bloodRepository.getReferenceById(5L),
                    aspectRepository.getReferenceById(12L), //Hope
                    swayRepository.getReferenceById(1L)
            );

            signRepository.saveAll(
                    List.of(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)
            );

            //Derse
            Sign d1 = new Sign(
                    "Leun",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/05%20Olive/Derse/Leun.png",
                    bloodRepository.getReferenceById(5L),
                    aspectRepository.getReferenceById(1L), //Breath
                    swayRepository.getReferenceById(2L)
            );
            Sign d2 = new Sign(
                    "Lesces",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/05%20Olive/Derse/Lesces.png",
                    bloodRepository.getReferenceById(5L),
                    aspectRepository.getReferenceById(2L), //Life
                    swayRepository.getReferenceById(2L)
            );
            Sign d3 = new Sign(
                    "Lepia",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/05%20Olive/Derse/Lepia.png",
                    bloodRepository.getReferenceById(5L),
                    aspectRepository.getReferenceById(3L), //Light
                    swayRepository.getReferenceById(2L)
            );
            Sign d4 = new Sign(
                    "Leries",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/05%20Olive/Derse/Leries.png",
                    bloodRepository.getReferenceById(5L),
                    aspectRepository.getReferenceById(4L), //Time
                    swayRepository.getReferenceById(2L)
            );
            Sign d5 = new Sign(
                    "Leo",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/05%20Olive/Derse/Leo.png",
                    bloodRepository.getReferenceById(5L),
                    aspectRepository.getReferenceById(5L), //Heart
                    swayRepository.getReferenceById(2L)
            );
            Sign d6 = new Sign(
                    "Leiborn",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/05%20Olive/Derse/Leiborn.png",
                    bloodRepository.getReferenceById(5L),
                    aspectRepository.getReferenceById(6L), //Rage
                    swayRepository.getReferenceById(2L)
            );
            Sign d7 = new Sign(
                    "Lecen",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/05%20Olive/Derse/Lecen.png",
                    bloodRepository.getReferenceById(5L),
                    aspectRepository.getReferenceById(7L), //Blood
                    swayRepository.getReferenceById(2L)
            );
            Sign d8 = new Sign(
                    "Lemini",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/05%20Olive/Derse/Lemini.png",
                    bloodRepository.getReferenceById(5L),
                    aspectRepository.getReferenceById(8L), //Doom
                    swayRepository.getReferenceById(2L)
            );
            Sign d9 = new Sign(
                    "Leittarius",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/05%20Olive/Derse/Leittarius.png",
                    bloodRepository.getReferenceById(5L),
                    aspectRepository.getReferenceById(9L), //Void
                    swayRepository.getReferenceById(2L)
            );
            Sign d10 = new Sign(
                    "Lega",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/05%20Olive/Derse/Lega.png",
                    bloodRepository.getReferenceById(5L),
                    aspectRepository.getReferenceById(10L), //Space
                    swayRepository.getReferenceById(2L)
            );
            Sign d11 = new Sign(
                    "Leza",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/05%20Olive/Derse/Leza.png",
                    bloodRepository.getReferenceById(5L),
                    aspectRepository.getReferenceById(11L), //Mind
                    swayRepository.getReferenceById(2L)
            );
            Sign d12 = new Sign(
                    "Lerius",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/05%20Olive/Derse/Lerius.png",
                    bloodRepository.getReferenceById(5L),
                    aspectRepository.getReferenceById(12L), //Hope
                    swayRepository.getReferenceById(2L)
            );

            signRepository.saveAll(
                    List.of(d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12)
            );
        };
    }

    @Bean
    CommandLineRunner commandLineRunnerJade(SignRepository signRepository){
        return args -> {
            //Prospit
            Sign p1 = new Sign(
                    "Virus",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/06%20Jade/Prospit/Virus.png",
                    bloodRepository.getReferenceById(6L),
                    aspectRepository.getReferenceById(1L), //Breath
                    swayRepository.getReferenceById(1L)
            );
            Sign p2 = new Sign(
                    "Virsci",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/06%20Jade/Prospit/Virsci.png",
                    bloodRepository.getReferenceById(6L),
                    aspectRepository.getReferenceById(2L), //Life
                    swayRepository.getReferenceById(1L)
            );
            Sign p3 = new Sign(
                    "Virpio",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/06%20Jade/Prospit/Virpio.png",
                    bloodRepository.getReferenceById(6L),
                    aspectRepository.getReferenceById(3L), //Light
                    swayRepository.getReferenceById(1L)
            );
            Sign p4 = new Sign(
                    "Virist",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/06%20Jade/Prospit/Virist.png",
                    bloodRepository.getReferenceById(6L),
                    aspectRepository.getReferenceById(4L), //Time
                    swayRepository.getReferenceById(1L)
            );
            Sign p5 = new Sign(
                    "Virlo",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/06%20Jade/Prospit/Virlo.png",
                    bloodRepository.getReferenceById(6L),
                    aspectRepository.getReferenceById(5L), //Heart
                    swayRepository.getReferenceById(1L)
            );
            Sign p6 = new Sign(
                    "Viricorn",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/06%20Jade/Prospit/Viricorn.png",
                    bloodRepository.getReferenceById(6L),
                    aspectRepository.getReferenceById(6L), //Rage
                    swayRepository.getReferenceById(1L)
            );
            Sign p7 = new Sign(
                    "Vircer",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/06%20Jade/Prospit/Vircer.png",
                    bloodRepository.getReferenceById(6L),
                    aspectRepository.getReferenceById(7L), //Blood
                    swayRepository.getReferenceById(1L)
            );
            Sign p8 = new Sign(
                    "Virmino",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/06%20Jade/Prospit/Virmino.png",
                    bloodRepository.getReferenceById(6L),
                    aspectRepository.getReferenceById(8L), //Doom
                    swayRepository.getReferenceById(1L)
            );
            Sign p9 = new Sign(
                    "Virittanius",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/06%20Jade/Prospit/Virittanius.png",
                    bloodRepository.getReferenceById(6L),
                    aspectRepository.getReferenceById(9L), //Void
                    swayRepository.getReferenceById(1L)
            );
            Sign p10 = new Sign(
                    "Virgo",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/06%20Jade/Prospit/Virgo.png",
                    bloodRepository.getReferenceById(6L),
                    aspectRepository.getReferenceById(10L), //Space
                    swayRepository.getReferenceById(1L)
            );
            Sign p11 = new Sign(
                    "Virra",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/06%20Jade/Prospit/Virra.png",
                    bloodRepository.getReferenceById(6L),
                    aspectRepository.getReferenceById(11L), //Mind
                    swayRepository.getReferenceById(1L)
            );
            Sign p12 = new Sign(
                    "Virnius",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/06%20Jade/Prospit/Virnius.png",
                    bloodRepository.getReferenceById(6L),
                    aspectRepository.getReferenceById(12L), //Hope
                    swayRepository.getReferenceById(1L)
            );

            signRepository.saveAll(
                    List.of(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)
            );

            //Derse
            Sign d1 = new Sign(
                    "Virun",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/06%20Jade/Derse/Virun.png",
                    bloodRepository.getReferenceById(6L),
                    aspectRepository.getReferenceById(1L), //Breath
                    swayRepository.getReferenceById(2L)
            );
            Sign d2 = new Sign(
                    "Virsces",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/06%20Jade/Derse/Virsces.png",
                    bloodRepository.getReferenceById(6L),
                    aspectRepository.getReferenceById(2L), //Life
                    swayRepository.getReferenceById(2L)
            );
            Sign d3 = new Sign(
                    "Virpia",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/06%20Jade/Derse/Virpia.png",
                    bloodRepository.getReferenceById(6L),
                    aspectRepository.getReferenceById(3L), //Light
                    swayRepository.getReferenceById(2L)
            );
            Sign d4 = new Sign(
                    "Viries",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/06%20Jade/Derse/Viries.png",
                    bloodRepository.getReferenceById(6L),
                    aspectRepository.getReferenceById(4L), //Time
                    swayRepository.getReferenceById(2L)
            );
            Sign d5 = new Sign(
                    "Viro",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/06%20Jade/Derse/Viro.png",
                    bloodRepository.getReferenceById(6L),
                    aspectRepository.getReferenceById(5L), //Heart
                    swayRepository.getReferenceById(2L)
            );
            Sign d6 = new Sign(
                    "Viriborn",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/06%20Jade/Derse/Viriborn.png",
                    bloodRepository.getReferenceById(6L),
                    aspectRepository.getReferenceById(6L), //Rage
                    swayRepository.getReferenceById(2L)
            );
            Sign d7 = new Sign(
                    "Vircen",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/06%20Jade/Derse/Vircen.png",
                    bloodRepository.getReferenceById(6L),
                    aspectRepository.getReferenceById(7L), //Blood
                    swayRepository.getReferenceById(2L)
            );
            Sign d8 = new Sign(
                    "Virmini",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/06%20Jade/Derse/Virmini.png",
                    bloodRepository.getReferenceById(6L),
                    aspectRepository.getReferenceById(8L), //Doom
                    swayRepository.getReferenceById(2L)
            );
            Sign d9 = new Sign(
                    "Virittarius",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/06%20Jade/Derse/Virittarius.png",
                    bloodRepository.getReferenceById(6L),
                    aspectRepository.getReferenceById(9L), //Void
                    swayRepository.getReferenceById(2L)
            );
            Sign d10 = new Sign(
                    "Virga",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/06%20Jade/Derse/Virga.png",
                    bloodRepository.getReferenceById(6L),
                    aspectRepository.getReferenceById(10L), //Space
                    swayRepository.getReferenceById(2L)
            );
            Sign d11 = new Sign(
                    "Virza",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/06%20Jade/Derse/Virza.png",
                    bloodRepository.getReferenceById(6L),
                    aspectRepository.getReferenceById(11L), //Mind
                    swayRepository.getReferenceById(2L)
            );
            Sign d12 = new Sign(
                    "Virrius",
                    "https://file.garden/YyjZcNX23DJlLN5o/ExtendedZodiacSigns/06%20Jade/Derse/Virrius.png",
                    bloodRepository.getReferenceById(6L),
                    aspectRepository.getReferenceById(12L), //Hope
                    swayRepository.getReferenceById(2L)
            );

            signRepository.saveAll(
                    List.of(d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12)
            );
        };
    }
}
