package com.example.testing.aspect;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table
public class Aspect {
    @Id
    @SequenceGenerator(
            name = "aspect_sequence",
            sequenceName = "aspect_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "aspect_sequence"
    )
    private Long id;
    private String name;

    public Aspect(){}

    public Aspect(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Aspect(String name) {
        this.name = name;
    }
}
