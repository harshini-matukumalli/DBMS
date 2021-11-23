package com.jpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "leagues")
@Getter
@Setter
public class Leagues {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int leagueID;
    public String name;
    public String understatNotation;

    @Override
    public String toString() {
        return "Leagues{" +
                "leagueID=" + leagueID +
                ", name='" + name + '\'' +
                ", understatNotation='" + understatNotation + '\'' +
                '}';
    }
}
