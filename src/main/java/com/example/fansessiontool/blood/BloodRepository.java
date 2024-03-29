package com.example.fansessiontool.blood;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BloodRepository extends JpaRepository<Blood, Long> {
    Blood findByColorIgnoreCase(String color);
}
