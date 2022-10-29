package HomeWorke2_7;

import transport.BodyTypePassebgerCars;
import transport.Car;
import transport.PassengerCars;
import transport.TrucksCar;

import static HomeWorke2_7.Date.checkPassworldLogin;
import static transport.Car.checkDiagnostic;
import static transport.PassengerCars.checkDiagnosticPassengerCars;
import static transport.TrucksCar.checkDiagnosticTruck;

public class Main {
    public static void main(String[] args)
            throws WrongPasswordException, WrongLoginException,PassDiagnosticsException {
        Date dateOne = new Date("0Zz_zzz-zzzz", "sTT-666110_s", "sTT-666110_s");
        checkPassworldLogin(dateOne);
        Car car1=new Car("Шкода","актавия",2022);
        checkDiagnostic(car1);
        TrucksCar trucksCar1 = new TrucksCar("BMW", "x5", 1.5f, 2022);
        checkDiagnosticTruck(trucksCar1);
       PassengerCars passengerCars1=new PassengerCars("kia","rio", BodyTypePassebgerCars.SEDAN, 2000);
        checkDiagnosticPassengerCars(passengerCars1);

    }
}
