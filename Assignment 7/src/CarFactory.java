import jdk.jshell.spi.ExecutionControl.NotImplementedException;

public class CarFactory {

    public Drivable getCar(String carName) throws NotImplementedException {
        if (carName.equalsIgnoreCase("Fiat")) {
            return new Fiat();
        } else if (carName.equalsIgnoreCase("BMW")) {
            return new BMW();
        } else if (carName.equalsIgnoreCase("Porsche")) {
            return new Porsche();
        } else if (carName.equalsIgnoreCase("")) {
            throw new NotImplementedException("No such car type: " + carName);
        } else {
            throw new NotImplementedException("No such car type: " + carName);
        }
    }
}
