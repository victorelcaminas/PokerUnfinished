public class MultiDeck {
    private Card[] cards;

    public MultiDeck(int numDecks) {
        cards = new Card[52 * numDecks];
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
}
