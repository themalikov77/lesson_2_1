
public  class VolleyballPlayer extends Footballer{

    private double growth;
    private String whatLeague;
    private TshirtColor tshirtColor;
    private Referee referee;

    public VolleyballPlayer(int growth, String whatLeague,TshirtColor tshirtColor,
                            Referee referee,int amountOfGoals, String position, String kindOfSport, int playerNumber, String nameCoach) {
        super(amountOfGoals,position,kindOfSport,playerNumber,nameCoach,referee,tshirtColor);
        this.tshirtColor=TshirtColor.WHITE;
        this.referee=referee;
        this.growth = growth;
        this.whatLeague = whatLeague;
    }
    public VolleyballPlayer(int growth, TshirtColor tshirtColor,
                            Referee referee,int amountOfGoals, String position, String kindOfSport, int playerNumber, String nameCoach) {
        super(amountOfGoals, position, kindOfSport, playerNumber, nameCoach, referee, tshirtColor);
        this.tshirtColor = TshirtColor.WHITE;
        this.referee = referee;
        this.growth = growth;
    }



    @Override
    public TshirtColor getTshirtColor() {
        return tshirtColor;
    }



    @Override
    public String getInfo() {
        if (whatLeague == null) {
            return super.getInfo() +
                    "\nGrowth: " + growth;}
        else      return super.getInfo() +
            "\nGrowth: " + growth +
                "\nWhat legue: " + whatLeague; }


    public int getGrowth() {
        return (int) growth;
    }

    public String getWhatLeague() {
        return whatLeague;
    }
}
