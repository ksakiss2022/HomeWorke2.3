package HomeWorke2_7;

import Driver.DriverC;
import transport.BodyTypePassebgerCars;
import transport.PassengerCars;
import transport.TrucksCar;

import static HomeWorke2_7.Date.checkPassworldLogin;

public class Main {
    public static void main(String[] args)
            throws WrongPasswordException, WrongLoginException, PassDiagnosticsException, IllegalAccessException {
        Date dateOne = new Date("0Zz_zzz-zzzz", "sTT-666110_s", "sTT-666110_s");
        checkPassworldLogin(dateOne);

        TrucksCar trucksCar1 = new TrucksCar("BMW", "x5", 1.5f, 2022);
        trucksCar1.diagnosticTransport();
        PassengerCars passengerCars1 = new PassengerCars("kia", "rio", BodyTypePassebgerCars.PICKUP_TRUCK, 2022);
        passengerCars1.diagnosticTransport();
        DriverC driverC = new DriverC("Иванов Петр Петрович",null
                ,24,
                null);
    }
}
//    public DriverC(String driverSFullName,
//                   Character thePresenceOfADriverSLicense,
//                   int experience,
//                   TrucksCar transport) throws IllegalAccessException {
//        super(driverSFullName, thePresenceOfADriverSLicense, experience, transport);
//}
