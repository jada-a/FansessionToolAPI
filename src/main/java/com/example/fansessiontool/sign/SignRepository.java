package com.example.fansessiontool.sign;

import com.example.fansessiontool.blood.Blood;
import com.example.fansessiontool.lunarSway.LunarSway;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SignRepository extends JpaRepository<Sign, Long> {
    Sign findByName(String name);

    List<Sign> findByBloodColor(Blood bloodColor);
    List<Sign> findByLunarSway(LunarSway lunarSway);
}
