package Gambler;

public class GamblerUC5 {
    static int numOfBets;
    static int wonDays = 0;
    static int lostDays = 0;

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
                    win++;

                } else {
                    stake--;
                    loss++;
                }

                numOfBets++;

            }

            totalStake = totalStake + stake;
            totalNumOfBets += numOfBets;

            if (stake > 100) {
                wonDays++;
            } else
                lostDays++;

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

        GamblerUC5 gamblerUC5 = new GamblerUC5();
        int totalStake = gamblerUC5.playGame();
        System.out.println("The stake now is : " + totalStake);
        System.out.println("Total Bets :" + numOfBets);
        System.out.println("Total Days won : " +  wonDays);
        System.out.println("Total Days lost : " + lostDays);

    }
}
