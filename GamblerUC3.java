package Gambler;

public class GamblerUC3 {
    static int stake = 100;
    static int numOfBets = 1;

    public int playGame() {
        int win = 0;
        int loss = 0;

        System.out.println("Welcome to Game.");

        while (stake >= 51 && stake <= 149) {

            double random = Math.random();

            if (random > 0.5) {
                stake++;
                win++;

            } else {
                stake--;
                loss++;
            }

            numOfBets++;
        }

        System.out.println("Total games won " + win);
        System.out.println("Total games lost " + loss);

        return stake;

    }

    public static void main(String[] args) {

        GamblerUC3 gamblerUC3 = new GamblerUC3();
        stake = gamblerUC3.playGame();
        System.out.println("The stake now is : " + stake);
        System.out.println("Total number of bets : " +  numOfBets);

    }
}
