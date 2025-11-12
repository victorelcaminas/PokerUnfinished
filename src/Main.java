import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer;
        boolean gameOver = false;
        MultiDeck mazo = new MultiDeck(2);
        mazo.shuffle();
        Player player = new Player("Víctor");
        player.dealCard(mazo.extractCard());
        player.dealCard(mazo.extractCard());

        while (!gameOver) {
            System.out.println(player);
            System.out.println("Score: " + player.getScore());
            System.out.println("Another card (Y/N)?");
            answer = input.next().toUpperCase();
            if (answer.equals("Y")) {
                player.dealCard(mazo.extractCard());
                if (player.getScore() > 21) {
                    System.out.println(player);
                    System.out.println("Score :" + player.getScore());
                    System.out.println("You loose !!!");
                    gameOver = true;
                }
            } else if (answer.equals("N")) {
                gameOver = true;
            }
        }
    }
}
