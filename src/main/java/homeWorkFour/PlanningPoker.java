package homeWorkFour;

import java.util.Random;

public class PlanningPoker {
    public static void main(String[] args) {
        String[] card = new String[20];
        card[0] = "eight Hearts";
        card[1] = "Ace";
        card[2] = "King";
        card[3] = "Queen";
        card[4] = "Jack";
        card[5] = "ten";
        card[6] = "nine";
        card[7] = "eight";
        card[8] = "seven";
        card[9] = "six";
        card[10] = "five";
        card[11] = "four";
        card[12] = "three";
        card[13] = "two";
        card[14] = "Ace Hearts";
        card[15] = "King Hearts";
        card[16] = "Queen Heart";
        card[17] = "Jack Hearts";
        card[18] = "ten Hearts";
        card[19] = "nine Hearts";

        Random random = new Random();
        int index = random.nextInt(card.length);
        System.out.println(index);
    }
}
