package com.jpa.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name = "player")
@Getter
@Setter
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int playerID;
    public String name;

    @Override
    public String toString() {
        return "Player{" +
                "playerID=" + playerID +
                ", name='" + name + '\'' +
                '}';
    }
}
