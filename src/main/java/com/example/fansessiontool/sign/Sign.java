package com.example.fansessiontool.sign;

import com.example.fansessiontool.aspect.Aspect;
import com.example.fansessiontool.blood.Blood;
import com.example.fansessiontool.lunarSway.LunarSway;
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

    private String image;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "blood_id")
    private Blood bloodColor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "aspect_id")
    private Aspect aspect;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sway_id")
    private LunarSway lunarSway;

    public Sign(){}

    public Sign(String name, String image, Blood bloodColor, Aspect aspect, LunarSway lunarSway) {
        this.name = name;
        this.bloodColor = bloodColor;
        this.aspect = aspect;
        this.lunarSway = lunarSway;
        this.image = image;
    }
}
