package com.jpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "teams")
@Getter
@Setter
public class Teams {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int teamID;
    public String name;

    @Override
    public String toString() {
        return "Teams{" +
                "teamID=" + teamID +
                ", name='" + name + '\'' +
                '}';
    }
}
