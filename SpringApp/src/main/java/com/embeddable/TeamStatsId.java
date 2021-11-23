package com.embeddable;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class TeamStatsId implements Serializable {
    public int gameID;
    public int teamID;
}
