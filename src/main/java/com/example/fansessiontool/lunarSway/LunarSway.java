package com.example.fansessiontool.lunarSway;

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
public class LunarSway {
    @Id
    @SequenceGenerator(
            name = "lunar_sequence",
            sequenceName = "lunar_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "lunar_sequence"
    )
    private Long id;

    private String name;

    private String image;

    public LunarSway(){}
    public LunarSway(String name, String image) {
        this.name = name;
        this.image = image;
    }
}
