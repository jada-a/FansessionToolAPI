package com.example.testing.blood;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BloodConfig {
    @Bean
    CommandLineRunner commandLineRunner2(BloodRepository bloodRepository){
        return args -> {
            Blood rust = new Blood(
                    "Rust",
                    "A10000"
            );
            Blood bronze = new Blood(
                    "Bronze",
                    "A25203"
            );
            Blood gold = new Blood(
                    "Gold",
                    "A1A100"
            );
            Blood lime = new Blood(
                    "Lime",
                    "658200"
            );
            Blood olive = new Blood(
                    "Olive",
                    "416600"
            );
            Blood jade = new Blood(
                    "Jade",
                    "078446"
            );
            Blood teal = new Blood(
                    "Teal",
                    "008282"
            );
            Blood blue = new Blood(
                    "Blue",
                    "004182"
            );
            Blood indigo = new Blood(
                    "Indigo",
                    "A0021CB"
            );
            Blood purple = new Blood(
                    "Purple",
                    "631DB4"
            );
            Blood violet = new Blood(
                    "Violet",
                    "6A006A"
            );
            Blood fuchsia = new Blood(
                    "Fuchsia",
                    "99004D"
            );



            bloodRepository.saveAll(
                    List.of(rust, bronze, gold, lime, olive, jade, teal, blue, indigo, purple,violet, fuchsia)
            );
        };
    }
}
