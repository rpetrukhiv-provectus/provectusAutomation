package homeworkThree;

public class Triangle {
    public static void main(String[] args) {
        int Rside = 5;
        int Lside = 5;
        int Bottom = 3;

        if (Rside==Lside && Rside!=Bottom){
            System.out.println("Sides are equals");
        }
        else if (Rside>=Lside || Lside!=Bottom){
            System.out.println("Isosceles Triangle!!!");
        }
        else {
            System.out.println("You must be kidding, right?");
        }
    }
}
