package com.jpa.entity;

import com.embeddable.TeamStatsId;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "teamstats")
@Getter
@Setter
public class TeamStats {

    @EmbeddedId
    public TeamStatsId teamStatsId;
    public int season;
    public int goals;
    public float xGoals;
    public int shots;
    public int shotsOnTarget;
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "MM-dd-yyyy hh:mm:ss")
    public Date date;
    public String location;
    public int deep;

    @Override
    public String toString() {
        return "TeamStats{" +
                "teamStatsId=" + teamStatsId +
                ", season=" + season +
                ", goals=" + goals +
                ", xGoals=" + xGoals +
                ", shots=" + shots +
                ", shotsOnTarget=" + shotsOnTarget +
                ", date=" + date +
                ", location='" + location + '\'' +
                ", deep=" + deep +
                '}';
    }
}
