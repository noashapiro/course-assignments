import java.util.Scanner;

public class SecondClass {
    public static void main(String[] args) {
        //1
        int x = 1;
        int y = 2;

        if (x > y) {
            System.out.println("BIG");
        }

        if (x < y) {
            System.out.println("small");
        }

        //2
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        //3a
        int season = 1;
        switch (season) {
            case 1:
                System.out.println("summer");
                break;
            case 2:
                System.out.println("winter");
                break;
            case 3:
                System.out.println("fall");
                break;
            case 4:
                System.out.println("spring");
                break;
        }

        //3b
        if (season == 1) {
            System.out.println("summer");
        } else if (season == 2) {
            System.out.println("winter");
        } else if (season == 3) {
            System.out.println("fall");
        } else if (season == 4) {
            System.out.println("spring");
        }

        //4
        // 10
        // 10

        //5
        int age = 10;
        char firstLetter = 'g';
        double currency = 3.4;
        boolean flew = true;

        String aptNumber = "73";
        System.out.println(age);
        System.out.println(firstLetter);
        System.out.println(currency);
        System.out.println(flew);
        System.out.println(aptNumber);

        int temp = (int) currency;
        System.out.println(temp);

        System.out.println(Integer.parseInt(aptNumber));

        //6
        System.out.println("Please enter a phone number");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Phone nubmer: " + scanner.next());


        //10
        // 20

        //11
        // infinite loop, won't never stop.

        //12
        // false

        //13
        // I can't understand what is the differences.
    }

    // 7
    static void printHello(){
        System.out.println("Hello");
    }

    static void calculate(){
        System.out.println(5 + 3.2);
    }

    //8
    static void printName(String name){
        System.out.println(name);
    }

    static void divideAndPrint(int number){
        System.out.println(number / 2);
    }

    //9
    static int addNumbers(int x, int y){
        return x + y;
    }

    static String addSpace(String x, String y) {
        return x + " " + y;
    }
}