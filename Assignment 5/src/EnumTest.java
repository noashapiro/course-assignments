import java.util.Scanner;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println("Please choose server ON/OFF");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        try {
            Modes modes = Modes.valueOf(choice);
            switch (modes) {
                case ON:
                    System.out.println("Lights ON");
                    break;
                case OFF:
                    System.out.println("Lights OFF");
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid choice");
        }
    }
}
