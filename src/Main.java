public class Main {
    public static void main(String[] args) {
        MultiDeck mazo = new MultiDeck(2);
        mazo.shuffle();
        Player player = new Player("Víctor");
        player.dealCard(mazo.extractCard());
        player.dealCard(mazo.extractCard());
        System.out.println(player);
    }
}
