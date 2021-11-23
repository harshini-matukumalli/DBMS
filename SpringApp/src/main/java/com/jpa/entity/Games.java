package com.jpa.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "games")
@Getter
@Setter
public class Games {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int gameID;
    public int leagueID;
    public int season;
    public int awayGoals;
    public int homeGoals;
    public int awayTeamID;
    public int homeTeamID;
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "MM-dd-yyyy hh:mm:ss")
    public Date date;
    public float homeProbability;
    public float drawProbability;

    @Override
    public String toString() {
        return "Games{" +
                "gameID=" + gameID +
                ", leagueID=" + leagueID +
                ", season=" + season +
                ", awayGoals=" + awayGoals +
                ", homeGoals=" + homeGoals +
                ", awayTeamID=" + awayTeamID +
                ", homeTeamID=" + homeTeamID +
                ", date=" + date +
                ", homeProbability=" + homeProbability +
                ", drawProbability=" + drawProbability +
                '}';
    }
}
