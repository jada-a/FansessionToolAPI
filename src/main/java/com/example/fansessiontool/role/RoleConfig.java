package com.example.fansessiontool.role;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class RoleConfig {
    @Bean
    CommandLineRunner commandLineRunner3(RoleRepository roleRepository){
        return args -> {
            Role thief = new Role(
                    "Thief",
                    "Active",
                    "Steal"
            );
            Role rogue = new Role(
                    "Rogue",
                    "Passive",
                    "Steal"
            );
            Role prince = new Role(
                    "Prince",
                    "Active",
                    "Destroy"
            );
            Role bard = new Role(
                    "Bard",
                    "Passive",
                    "Destroy"
            );
            Role witch = new Role(
                    "Witch",
                    "Active",
                    "Manipulate"
            );
            Role heir = new Role(
                    "Heir",
                    "Passive",
                    "Manipulate"
            );
            Role maid = new Role(
                    "Maid",
                    "Active",
                    "Create"
            );
            Role sylph = new Role(
                    "Sylph",
                    "Passive",
                    "Create"
            );
            Role mage = new Role(
                    "Mage",
                    "Active",
                    "Inform"
            );
            Role seer = new Role(
                    "Seer",
                    "Passive",
                    "Inform"
            );
            Role knight = new Role(
                    "Knight",
                    "Active",
                    "Apply"
            );
            Role page = new Role(
                    "Page",
                    "Passive",
                    "Apply"
            );

            roleRepository.saveAll(
                    List.of(thief, rogue, prince, bard, witch, heir, maid, sylph, mage, seer, knight, page)
            );

        };
    }
}
