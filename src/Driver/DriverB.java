package Driver;

import transport.PassengerCars;

public class DriverB extends Driver<PassengerCars> {


    public DriverB(String driverSFullName,
                   Character thePresenceOfADriverSLicense,
                   int experience, PassengerCars transport) {
        super(driverSFullName, 'B', experience, transport);

    }
}
