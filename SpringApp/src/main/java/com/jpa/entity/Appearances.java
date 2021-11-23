package com.jpa.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.embeddable.AppearanceId;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "appearances")
@Getter
@Setter
public class Appearances {

    @EmbeddedId
    public AppearanceId appearanceId;
    public int assists;
    public int keyPasses;
    public float xGoalsChain;
    public float xGoalsBuildup;
    public float xGoals;
    public int shots;
    public int goals;
    public int ownGoals;

    @Override
    public String toString() {
        return "Appearances{" +
                "appearanceId=" + appearanceId +
                ", assists=" + assists +
                ", keyPasses=" + keyPasses +
                ", xGoalsChain=" + xGoalsChain +
                ", xGoalsBuildup=" + xGoalsBuildup +
                ", xGoals=" + xGoals +
                ", shots=" + shots +
                ", goals=" + goals +
                ", ownGoals=" + ownGoals +
                '}';
    }
}
