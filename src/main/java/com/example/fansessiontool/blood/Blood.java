package com.example.fansessiontool.blood;

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
public class Blood {
    @Id
    @SequenceGenerator(
            name = "blood_sequence",
            sequenceName = "blood_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "blood_sequence"
    )
    private Long id;
    private String color;

    private String hexCode;

    public Blood() {
    }

    public Blood(String color, String hexCode) {
        this.color = color;
        this.hexCode = hexCode;
    }
}
