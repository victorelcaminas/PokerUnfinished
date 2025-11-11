public class Card {
    private int number;
    private String suit;

    public static final String[] SUITS = {"♠", "♥", "♦", "♣"};

    public Card(int number, String suit) {
        this.number = number;
        this.suit = suit;
    }

    @Override
    public String toString() {
        String s = "";
        if (number == 1) {
            s += "A";
        } else if (number <= 10) {
            s += number;
        } else if (number == 11) {
            s += "J";
        } else if (number == 12) {
            s += "Q";
        } else {
            s += "K";
        }
        s += " de " + suit;
        return s;
    }

    public String getSuit() {
        return suit;
    }

    public int getNumber() {
        return number;
    }
}
