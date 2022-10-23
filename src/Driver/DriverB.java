package Driver;

import transport.PassengerCars;

public class DriverB extends Driver<PassengerCars> {


    public DriverB(String driverSFullName,
                   Character thePresenceOfADriverSLicense,
                   int experience, PassengerCars transport) {
        super(driverSFullName, thePresenceOfADriverSLicense, experience, transport);

    }
    public void printDriverB() {


        System.out.println("Водитель " + getDriverSFullName() +", "+
                "категория прав " + getThePresenceOfADriverSLicense() + ", "+"стаж "
                + getExperience()+". ");
    }
}
