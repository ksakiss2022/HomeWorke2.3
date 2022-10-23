package Driver;

import transport.Competing;
import transport.PassengerCars;
import transport.Transport;

public abstract class Driver<D extends Transport & Competing> {

    final private String driverSFullName;


    final private Character thePresenceOfADriverSLicense;
    //Наличие водительских прав
    private int experience;


    //стаж
    private D transport;

    public Driver(String driverSFullName,
                  Character thePresenceOfADriverSLicense,
                  int experience,
                  D transport) {

        if (driverSFullName == null &&
                !driverSFullName.isEmpty() &&
                !driverSFullName.isBlank()) {
            throw new NullPointerException("Укажите имя водителя ");
        } else {
            this.driverSFullName = driverSFullName;
        }

        if (thePresenceOfADriverSLicense != 'B' && thePresenceOfADriverSLicense != 'C' && thePresenceOfADriverSLicense != 'D') {
            throw new NullPointerException("Нет прав, не допущен к поездкам");
        } else {
            this.thePresenceOfADriverSLicense = thePresenceOfADriverSLicense;
        }
        if (transport != null) {
            this.transport = transport;
        }
        setExperience(experience);

    }

    public void refuelingTheCar() {
        // заправить авто
        System.out.println("Заправляю транспорт");
//        System.out.println("Заправляю транспорт"+transport.getBrand()+"]");
    }


    public void startMovement() {
        System.out.println(driverSFullName + "Запускает двигатель " + transport.getBrand() + "," + transport.getModel());
        //начать движение
    }

    public void endMovement() {
        //закончить движение
        System.out.println(driverSFullName + "Останавливает " + transport.getBrand() + "," + transport.getModel());
    }

    public void refueling() {
        System.out.println(driverSFullName + "Заправляет " + transport.getBrand() + "," + transport.getModel());
    }

    public Character getThePresenceOfADriverSLicense() {
        return thePresenceOfADriverSLicense;
    }

    public String getDriverSFullName() {
        return driverSFullName;
    }

    public D getTransport() {
        return transport;
    }

    public void setTransport(D transport) {
        this.transport = transport;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
        if (experience <= 0) {
            System.out.println("Стаж вождения не установлен.");
        }
    }



    public void printDriver() {
        System.out.println("Водитель " + driverSFullName +", "+
                "управляет транспортом- " + transport.getBrand() + ", "+"модель- "
                + transport.getModel()+", "+"прошел отбор на участие в соревнованиях.");

        System.out.println("Имя водителя " + getDriverSFullName() +", "+
                "категория прав " + getThePresenceOfADriverSLicense() + ", "+"стаж "
                + getExperience()+" года (лет)");

    }
}

