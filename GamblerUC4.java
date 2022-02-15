package Gambler;

public class GamblerUC4 {

    static int numOfBets;

    public int playGame() {
        int win = 0;
        int loss = 0;
        int stake = 100;
        int totalStake = 0;
        int totalNumOfBets = 0;

        System.out.println("Welcome to Game.");

        for (int i = 1; i <= 20; i++) {

            while (stake >= 51 && stake <= 149) {

                double random = Math.random();

                if (random > 0.5) {
                    stake++;

                } else {
                    stake--;
                    loss++;
                }

                numOfBets++;

            }

            totalStake = totalStake + stake;
            totalNumOfBets += numOfBets;

        }

        if (totalStake > 2000){
            System.out.println("Amount won : " + (totalStake - 2000));
            System.out.println("Amount lost : " + "0");
        }

        else {
            System.out.println("Amount lost : " + (2000 - totalStake));
            System.out.println("Amount won : " + "0");
        }

        return totalStake;
    }

    public static void main(String[] args) {

        GamblerUC4 gamblerUC4 = new GamblerUC4();
        int totalStake = gamblerUC4.playGame();
        System.out.println("The stake now is : " + totalStake);
        System.out.println("Total Bets :" + numOfBets);
    }
}
