package homeWorkFour.poker;

import static homeWorkFour.poker.Cards.getNoOfCards;

public class Deck {

    private static String[] deck = new String[getNoOfCards()];

    public static String[] getDeck() {
        return deck;
    }

    static void createDeck() {
        String[] adorn = getDeck();
        String[] suites = {"Hearts", "Clubs", "Diamonds", "Spades"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int count = 0;
        for (String suit : suites) {
            for (String value : values) {
                adorn[count++] = value + " of " + suit;
            }
        }
    }

}
