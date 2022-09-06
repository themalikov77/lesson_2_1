public class Footballer extends Athletes{
    private int amountOfGoals;
    private String position;
    private TshirtColor tshirtColor;
    private Referee referee;

    public Footballer(int amountOfGoals, String position, String kindOfSport, int playerNumber, String nameCoach, Referee referee, TshirtColor tshirtColor) {
        super(kindOfSport,playerNumber,nameCoach);
        this.amountOfGoals = amountOfGoals;
        this.position = position;
        this.referee=referee;
        this.tshirtColor=tshirtColor;
    }

    public TshirtColor getTshirtColor() {
        return tshirtColor;
    }

    public Referee getReferee() {
        return referee;
    }

    public Footballer() {
    }

    public int getAmountOfGoals() {
        return amountOfGoals;
    }

    public String getPosition() {
        return position;
    }
    public void celebrateVictory(){
        System.out.println("Suuuu");
    }
    public void celebrateVictory(String victory) {
        System.out.println(victory);
    }
    public void upsetByTheLoss(){
        System.out.println("exxxxx");

    }
    public void upsetByTheLoss(String loss){
        System.out.println(loss);
    }
    public String getInfo(){
        return "Kind of sport:" + getKindOfSport()+
                "\nPlayer number: " + getPlayerNumber() +
                "\nName Coach: " + getNameCoach() +
                "\nT-shirt color: " + tshirtColor +
                "\nName referee: " + referee.getName() +
                "\nExperience referee: " + referee.getExperience() +
        "\nAmount of goals: " + amountOfGoals +
                "\nPosition: " + position;
    }

}
