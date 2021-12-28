import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
       //1
        try {
            int a = 1 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("You can't divide by 0");
        }
        //1b
        // זה חוקי, אם לא ברצונך לתפוס את הexception
        //1c
        //כל הסוגים של exceptions
        //1d
        //הטעות בשימוש היא שבדרך הזו לא ניתן לקבל הסבר על עומק הבעיה
        //1e
        //רק שגיאות אריטמטיות

        //2
        String[] names = {"Noa", "Shai", "Annie"};
        names[1] = "Omri";
        System.out.println(names[2]);

        //3
        Dog dog1 = new Dog("Niki",12, "Black and white");
        Dog dog2 = new Dog("Mika",5, "Golden");

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);

        System.out.println(dogs.get(0).getName());
        dogs.clear();
        System.out.println(dogs.size());

        //4
        ArrayList<String> random = new ArrayList(3);
        random.add("hi");
        random.add("hello");
        random.add("hey");

        for (int i = 0; i < random.size(); i++){
            if(i==1){
                System.out.println(random.get(i));
            }
        }

        //5
        int[] numbers = {1,2,3,4,5,6};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum +=  numbers[i];
        }
        System.out.println("Average is:" + (sum/numbers.length));

        //6
        Map<String,String> users = new HashMap<>();
        users.put("admin1","Password1");
        users.put("admin2","Password2");
        users.put("admin3","Password3");

        System.out.println(users.values());

        //7
        System.out.println("Please choose number from 1-4");
        int choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    System.out.println(Seasons.SUMMER);
                    break;
                case 2:
                    System.out.println(Seasons.AUTUM);
                    break;
                case 3:
                    System.out.println(Seasons.SPRING);
                    break;
                case 4:
                    System.out.println(Seasons.WINTER);
                    break;
            }

            //8
            //הקוד לא ואלידי כיוון שמשתנה שמוגדר כvar יכול להיות בשימוש רק בתוך פונקציה




    }
}
