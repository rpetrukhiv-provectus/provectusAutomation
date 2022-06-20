package homeWorkFour;

import java.util.Random;

public class Rarray {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(100);
        int[] array = new int[100];

        for (; i <= array.length;i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
            else {
                System.out.println("0");
            }
        }
    }
}
