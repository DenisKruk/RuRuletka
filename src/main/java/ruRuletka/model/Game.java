package ruRuletka.model;

import javax.persistence.Entity;

@Entity

public class Game {
    private int level;
    private int userScore;
    private boolean start;
}
