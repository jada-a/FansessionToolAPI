package com.example.fansessiontool.role;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table
public class Role {
    @Id
    @SequenceGenerator(
            name = "role_sequence",
            sequenceName = "role_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "role_sequence"
    )
    private Long id;
    private String name;
    private String activity;
    private String keyWord;

    public Role(){}

    public Role(String name, String activity, String keyWord) {
        this.name = name;
        this.activity = activity;
        this.keyWord = keyWord;
    }
}
