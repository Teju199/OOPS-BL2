package Gambler;

public class GamblerUC1 {

        int stake = 100;
        static int betPrice = 1;

        public void playGame() {

            if (betPrice == 1) {
                System.out.println("Welcome to the Game. Good luck.");
            } else
                System.out.println("Please make sure the bet price is $1 to start the game.");
        }

        public static void main(String[] args) {
            GamblerUC1 gamblerUC1 = new GamblerUC1();
            gamblerUC1.playGame();
        }

}
