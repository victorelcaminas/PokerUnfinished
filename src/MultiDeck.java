public class MultiDeck {
    private Card[] cards;
    private int numRemainingCards;

    public MultiDeck(int numDecks) {
        cards = new Card[52 * numDecks];
        numRemainingCards = cards.length;
        int counter = 0;
        for (int numDeck = 1; numDeck <= numDecks; numDeck++) {
            for(int numSuit = 0; numSuit < 4; numSuit++) {
                for (int number = 1; number <= 13; number++) {
                    cards[counter] = new Card(number, Card.SUITS[numSuit]);
                    counter++;
                }
            }
        }
    }

    public Card extractCard() {
        numRemainingCards--;
        return cards[numRemainingCards];
    }

    @Override
    public String toString() {
        String s = "";
        boolean first;
        for (int numSuit = 0; numSuit < 4; numSuit++) {
            String suit = Card.SUITS[numSuit];
            first = true;
            for (int i = 0; i < numRemainingCards; i++) {
                if (cards[i].getSuit().equals(suit)) {
                    if (first) {
                        first = false;
                    } else {
                        s += ", ";
                    }
                    s += cards[i];
                }
            }
            s+= "\n";
        }
        return s;
    }

    public void shuffle() {
        for (int i = 0; i < cards.length * 10; i++) {
            int n1 = (int) (Math.random() * cards.length);
            int n2 = (int) (Math.random() * cards.length);
            Card tempCard = cards[n1];
            cards[n1] = cards[n2];
            cards[n2] = tempCard;
        }
    }
}
