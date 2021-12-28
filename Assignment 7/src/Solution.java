import java.io.IOException;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException {
       //1
       //ניתן להשתמש בdesign patterns בכל השפות
       //2
        LogWriter logWriter = LogWriter.getInstance();
        logWriter.writer("Logs");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        LogWriter.getInstance().writer(scanner.next());
        System.out.println("Please enter your age");
        LogWriter.getInstance().writer(scanner.next());
        System.out.println("Please enter your address");
        LogWriter.getInstance().writer(scanner.next());
        System.out.println("Please enter your phone number");
        LogWriter.getInstance().writer(scanner.next());
        System.out.println("Thanks");
    }
}

