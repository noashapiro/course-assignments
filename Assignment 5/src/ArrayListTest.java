import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> myList= new ArrayList<String>(); // Create an ArrayList which can hold Strings
        myList.add("word"); // Add a new object (String) to ArrayList
        myList.set(0,"word2"); // Change the value in a given index (0) to a new value (word2)

        // Print all the array elements
        for (int i = 0; i < myList.size(); i++) { // Iterate through an array
            System.out.println(myList.get(i));
        }
        myList.remove(0); // Remove a specific index from ArrayList
    }
}
