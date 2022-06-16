package homeworkThree;

public class PrintMonthInWordWithBreak {
    public static void main(String[] args) {
        int day = 7;
        switch (day) {
            case 1:
                System.out.println("DEC");
                break;
            case 2:
                System.out.println("JAN");
                break;
            case 3:
                System.out.println("FEB");
                break;
            case 4:
                System.out.println("MAR");
                break;
            case 5:
                System.out.println("APR");
                break;
            case 6:
                System.out.println("MAY");
                break;
            case 7:
                System.out.println("JUN");
                break;
            case 8:
                System.out.println("JUL");
                break;
            case 9:
                System.out.println("AUG");
                break;
            case 10:
                System.out.println("SEP");
                break;
            case 11:
                System.out.println("OCT");
                break;
            case 12:
                System.out.println("NOV");
            case 13:
                System.out.println("Not a valid month!");
                break;
        }
    }
}
