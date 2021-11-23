package com.embeddable;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class AppearanceId implements Serializable {

    public int gameID;
    public int playerID;

}
