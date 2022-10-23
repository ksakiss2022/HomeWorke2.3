package Driver;

import transport.Bus;
import transport.TrucksCar;

public class DriverD extends Driver<Bus> {

    public DriverD(String driverSFullName,
                Character thePresenceOfADriverSLicense,
        int experience,
        Bus transport) {
            super(driverSFullName, thePresenceOfADriverSLicense, experience, transport);
        }

    public void printDriverD() {


        System.out.println("Имя водителя " + getDriverSFullName() +", "+
                "категория прав " + getThePresenceOfADriverSLicense() + ", "+"стаж "
                + getExperience()+" года (лет)");
        printDriver();
    }
    }


