package com.example.fansessiontool.lunarSway;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LunarSwayRepository extends JpaRepository<LunarSway, Long> {
}
