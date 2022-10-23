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

}
