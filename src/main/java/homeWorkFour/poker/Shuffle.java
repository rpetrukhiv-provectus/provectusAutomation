package homeWorkFour.poker;

import java.util.Random;

import static homeWorkFour.poker.Cards.getNoOfCards;
import static homeWorkFour.poker.Deck.getDeck;

public class Shuffle {

    public static void shuffleDeck() {
        //String[] deck = getDeck();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int in = random.nextInt(getNoOfCards());
            int out = random.nextInt(getNoOfCards());

            String tmpCard = getDeck()[in];
            getDeck()[in] = getDeck()[out];
            getDeck()[out] = tmpCard;
        }
    }
}