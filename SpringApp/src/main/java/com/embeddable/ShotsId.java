package com.embeddable;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ShotsId implements Serializable {

    public int gameID;
    public int shooterID;
    public int assisterID;
}
