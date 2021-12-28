import java.util.Scanner;

public class ThrowAnExceptionTest {
    public static void main(String[] args) throws Exception {
        System.out.println("Please enter 1 or 2");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice != 1 && choice != 2) {
            throw new Exception("Wrong input");
        }
    }
}
