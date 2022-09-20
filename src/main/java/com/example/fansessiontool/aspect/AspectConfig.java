package com.example.fansessiontool.aspect;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AspectConfig {

    @Bean
    CommandLineRunner commandLineRunner1(AspectRepository aspectRepository){
        return args -> {
            Aspect breath = new Aspect("Breath");
            Aspect life = new Aspect("Life");
            Aspect light = new Aspect("Light");
            Aspect time = new Aspect("Time");
            Aspect heart = new Aspect("Heart");
            Aspect rage = new Aspect("Rage");
            Aspect blood = new Aspect("Blood");
            Aspect doom = new Aspect("Doom");
            Aspect voidy = new Aspect("Void");
            Aspect space = new Aspect("Space");
            Aspect mind = new Aspect("Mind");
            Aspect hope = new Aspect("Hope");

            aspectRepository.saveAll(
                    List.of(breath, life, light, time, heart, rage, blood, doom, voidy, space, mind, hope)
            );

        };
    }
}
