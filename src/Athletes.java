import java.util.Random;

public class Athletes {
    private String kindOfSport;
    private int playerNumber;
    private String nameCoach;
    private TshirtColor tshirtColor;
    private Referee referee;

    public Athletes(TshirtColor tshirtColor) {
        this.tshirtColor = tshirtColor;
    }

    public Athletes(Referee referee) {
        this.referee = referee;
    }

    public Athletes(String kindOfSport, int playerNumber, String nameCoach) {
        this.kindOfSport = kindOfSport;
        this.playerNumber = playerNumber;
        this.nameCoach = nameCoach;
    }

    public Athletes() {
    }

    public String getKindOfSport() {
        return kindOfSport;
    }

    public TshirtColor getTshirtColor(TshirtColor tshirtColor) {
        return this.tshirtColor;
    }

    public Referee getReferee(Referee referee) {
        return this.referee;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public String getNameCoach() {
        return nameCoach;
    }


}
