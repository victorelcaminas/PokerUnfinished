public class Player {
    private String name;
    private Card[] cards;
    private int numCards;

    public Player(String name) {
        numCards = 0;
        this.name = name;
        cards = new Card[20];
        for (int i = 0; i < cards.length; i++) {
            cards[i] = null;
        }
    }

    public void dealCard(Card card) {
        cards[numCards] = card;
        numCards++;
    }

    @Override
    public String toString() {
        String s = name + ": ";
        boolean first = true;
        for (int i = 0; i < numCards; i++) {
            if (first) {
                first = false;
            } else {
                s += ", ";
            }
            s += cards[i];
        }
        return s;
    }

    public int getScore() {
        int score = 0;
        boolean thereWasAnAce = false;
        for (int i = 0; i < numCards; i++) {
            if (cards[i].getNumber() > 10) {
                score += 10;
            } else {
                score += cards[i].getNumber();
                if (cards[i].getNumber() == 1) {
                    thereWasAnAce = true;
                }
            }
        }
        if (thereWasAnAce && score + 10 <= 21 ) {
            score += 10;
        }
        return score;
    }
}
