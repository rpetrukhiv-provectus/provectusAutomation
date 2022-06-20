package homeWorkFour.poker;

import static homeWorkFour.poker.Deck.createDeck;
import static homeWorkFour.poker.ServeCards.serveCards;
import static homeWorkFour.poker.Shuffle.shuffleDeck;

public class Poker {

    public static void main(String[] args) {
        createDeck();
        shuffleDeck();
        serveCards();
    }
}