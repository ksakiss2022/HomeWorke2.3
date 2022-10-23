package Driver;

import transport.PassengerCars;
import transport.TrucksCar;

public class DriverC extends Driver<TrucksCar> {


    public DriverC(String driverSFullName,
                   Character thePresenceOfADriverSLicense,
                   int experience,
                   TrucksCar transport) {
        super(driverSFullName, thePresenceOfADriverSLicense, experience, transport);

    }
    public void printDriverC() {


        System.out.println("Имя водителя " + getDriverSFullName() +", "+
                "категория прав " + getThePresenceOfADriverSLicense() + ", "+"стаж "
                + getExperience()+" года (лет)");
        printDriver();
    }
}
