public class ArrayTest {
    public static void main(String[] args) {
        double[] myList = new double[3];
        myList[1]= 1.23;
        System.out.println(myList[0]);
        System.out.println(myList[1]);
        System.out.println(myList[2]);


        double[] myInitializedList ={2.5, 3.66, 8.49};
        for (int i = 0; i < myInitializedList.length; i++) {
            System.out.println(myInitializedList[i]);
        }
    }
}
