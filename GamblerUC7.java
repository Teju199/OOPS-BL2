package Gambler;

public class GamblerUC7 {
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


        return totalStake;
    }

    public static void main(String[] args) {

        GamblerUC7 gamblerUC7 = new GamblerUC7();
        int totalStake = gamblerUC7.playGame();
        System.out.println("The stake now is : " + totalStake);
        System.out.println("Total Bets :" + numOfBets);
        System.out.println("Total Days won : " +  wonDays);
        System.out.println("Total Days lost : " + lostDays);

        if (totalStake > 2000){
            System.out.println("Amount won : " + (totalStake - 2000));
            System.out.println("Amount lost : " + "0");
            System.out.println("Game to be continued for next month.");
            gamblerUC7.playGame();

        }

        else {
            System.out.println("Amount lost : " + (2000 - totalStake));
            System.out.println("Amount won : " + "0");
        }

    }
}
