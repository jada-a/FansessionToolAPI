package com.example.fansessiontool.lunarSway;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class LunarSwayConfig {
    @Bean
    CommandLineRunner commandLineRunner4(LunarSwayRepository lunarSwayRepository){
        return args -> {
            LunarSway prospit = new LunarSway(
                    "Prospit",
                    "https://file.garden/YyjZcNX23DJlLN5o/Moons/Prospit.png"
            );
            LunarSway derse = new LunarSway(
                    "Derse",
                    "https://file.garden/YyjZcNX23DJlLN5o/Moons/Derse.png"
            );
            lunarSwayRepository.saveAll(
                    List.of(prospit, derse)
            );
        };
    }
}
