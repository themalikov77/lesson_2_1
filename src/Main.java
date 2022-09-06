public class Main {
    public static void main(String[] args){
        Referee referee= new Referee("Alex",10);
        Footballer footballer= new Footballer
                (32,"attack", "football", 12 , "Jurgen Klopp",referee,TshirtColor.YELLOW );
        System.out.println(footballer.getInfo());
        footballer.celebrateVictory("gooool :)");
        footballer.celebrateVictory();
        footballer.upsetByTheLoss("zasudili :( ");
        footballer.upsetByTheLoss();


        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


       Referee referee1= new Referee("Ovechkin", 15);
       VolleyballPlayer volleyballPlayer = new VolleyballPlayer(180,"Super Liga", TshirtColor.RED, referee,20,
               "zashitniik", "volleyball", 27,"Ivan");
        System.out.println(volleyballPlayer.getInfo());
        volleyballPlayer.celebrateVictory();
        volleyballPlayer.celebrateVictory("Tak derjat parni!");
        volleyballPlayer.upsetByTheLoss();
        volleyballPlayer.upsetByTheLoss("povezet v drugoi raz");


        Referee referee2 = new Referee("Saitiev", 25);
        VolleyballPlayer volleyballPlayer1 = new VolleyballPlayer(175,TshirtColor.bLACK,referee2,30,"prinimayshii", "Volleyball", 23,"Malikov");
        System.out.println(volleyballPlayer1.getInfo());




    }
}