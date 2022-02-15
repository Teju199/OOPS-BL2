package Gambler;

public class GamblerUC2 {

    public int playGame() {
        int stake = 100;
        System.out.println("Welcome to Game.");

        double random = Math.floor(Math.random());

        if (random < 0.5) {
            System.out.println("The game is lost");
            stake--;
        } else {
            System.out.println("Won the game.");
            stake++;
        }

        return stake;
    }

    public static void main(String[] args) {
        GamblerUC2 gamblerUC2 = new GamblerUC2();
        int stake = gamblerUC2.playGame();
        System.out.println("The stake now is : " + stake);
    }
}
