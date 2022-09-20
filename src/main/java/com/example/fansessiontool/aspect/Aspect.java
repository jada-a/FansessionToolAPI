package com.example.fansessiontool.aspect;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table
@JsonIgnoreProperties({"hibernateLazyInitializer"})
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

    public Aspect(String name) {
        this.name = name;
    }
}
