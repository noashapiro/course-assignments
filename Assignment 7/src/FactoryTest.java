import jdk.jshell.spi.ExecutionControl.NotImplementedException;

public class FactoryTest {
    public FactoryTest() {
    }

    public static void main(String[] args) throws NotImplementedException {
        CarFactory carFactory = new CarFactory();
        Drivable myFiat = carFactory.getCar("Fiat");
        myFiat.drive();
        Drivable myBMW = carFactory.getCar("BMW");
        myBMW.drive();
        Drivable myPorsche = carFactory.getCar("");
        myPorsche.drive();
    }
}
