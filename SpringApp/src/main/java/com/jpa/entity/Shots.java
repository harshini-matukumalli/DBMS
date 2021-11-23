package com.jpa.entity;

import com.embeddable.ShotsId;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "shots")
@Setter
@Getter
public class Shots {

    @EmbeddedId
    public ShotsId shotsId;
    public float xGoal;
    public String shotType;
    public String shotResult;
    public String lastAction;
    public String situation;
    public float positionX;
    public float positionY;
    public int minute;

    @Override
    public String toString() {
        return "Shots{" +
                "shotsId=" + shotsId +
                ", xGoal=" + xGoal +
                ", shotType='" + shotType + '\'' +
                ", shotResult='" + shotResult + '\'' +
                ", lastAction='" + lastAction + '\'' +
                ", situation='" + situation + '\'' +
                ", positionX=" + positionX +
                ", positionY=" + positionY +
                ", minute=" + minute +
                '}';
    }
}
