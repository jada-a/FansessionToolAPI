package com.example.fansessiontool.sign;

import com.example.fansessiontool.blood.Blood;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "troll_sign")
public class Sign {
    @Id
    @SequenceGenerator(
            name = "sign_sequence",
            sequenceName = "sign_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "sign_sequence"
    )

    private Long id;

    private String name;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "blood_id")
    private Blood bloodColor;

    //private Aspect aspect;

    //private LunarSway lunarSway;

    public Sign(){}
    public Sign(String name, Blood bloodColor) {
        this.name = name;
        this.bloodColor = bloodColor;
    }
}
