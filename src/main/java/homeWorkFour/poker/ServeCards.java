package homeWorkFour.poker;

import static homeWorkFour.poker.Deck.getDeck;
import static homeWorkFour.poker.Players.getNoOfPlayers;

public class ServeCards {

    public static void serveCards() {
        String[] deck =  getDeck();
        int count = 0;
        for (int round = 1; round <= 5; round++) {
            System.out.println("=== ROUND " + round + " ===");
            for (int player = 1; player <= getNoOfPlayers(); player++) {
                System.out.printf("Player %d gets card: %s%n", player, deck[count++]);
            }
            System.out.println();
        }
    }
}
