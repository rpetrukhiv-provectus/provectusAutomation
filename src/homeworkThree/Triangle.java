package homeworkThree;

public class Triangle {
    public static void main(String[] args) {
        int rside = 5;
        int lside = 5;
        int bottom = 3;

        if (rside==lside && rside!=bottom){
            System.out.println("Sides are equals");
        }
        else if (rside>=lside || lside!=bottom){
            System.out.println("Isosceles Triangle!!!");
        }
        else {
            System.out.println("You must be kidding, right?");
        }
    }
}
