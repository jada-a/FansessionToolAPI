package com.example.fansessiontool.aspect;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AspectRepository extends JpaRepository<Aspect, Long> {

    Aspect findByNameIgnoreCase(String name);
}
