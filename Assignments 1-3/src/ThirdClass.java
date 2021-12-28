public class ThirdClass {
    public static void main(String[] args) {
        //1
        Horse horse1 = new Horse("Noa", 12);
        System.out.println(horse1.getName());

        //2
        Train jlmTrain = new Train("Jerusalem", 22);
        Train tlvTrain = new Train("TelAviv");

        //3
        //sam

        //4
        // Yes, josh will be printed
        // the result of setName is being ignored because we don't change the object name.

        //5
        // the code will throw a NullPointerException, because s was not initialized

        //6
        //6
        // Encapsulation in Java is a mechanism of wrapping the code and data
        // (variables)acting on the data (methods) together as a single unit.
        // In encapsulation, the variables of a class will be hidden from other classes,
        // and can be accessed only through the methods of their current class. Therefore,
        // it is also known as data hiding.ss

    }
}
