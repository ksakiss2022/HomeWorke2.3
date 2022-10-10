package transport;

import java.security.Key;
import java.time.LocalDate;

public class Car {
    public String numberAuto;
    public float engineVolume;
    public String color;
    private String brand;
    private String model;
    public int productionYear;
    public String productionCountry;
    public String transmission;
    //Коробка передач
    public String bodyType;
    // Тип кузова
    public String registrationNumber;
    //Регистрационный номер
    public int numberOfSeats;
    // Количество мест
    public String tires;
    //sign "Summer" or "Winter tires" признак «Летняя» или «Зимняя резина»
    public int monthNumber;

    private Key key;


    private Insurance insurance;

    public static class Insurance {

        private LocalDate insuranceValidityPeriod;

        //Срок действия страховки
        private double theCostOfInsurance;
        //Стоимость страховки
        private String insuranceNumber;

        public LocalDate getInsuranceValidityPeriod() {
            return insuranceValidityPeriod;
        }

        public void setInsuranceValidityPeriod(LocalDate insuranceValidityPeriod) {
            this.insuranceValidityPeriod = insuranceValidityPeriod;
            if (insuranceValidityPeriod == null) {
                this.insuranceValidityPeriod = LocalDate.now();
            }
        }

        public double getTheCostOfInsurance() {
            return theCostOfInsurance;
        }

        public void setTheCostOfInsurance(double theCostOfInsurance) {
            this.theCostOfInsurance = theCostOfInsurance;
        }

        public String getInsuranceNumber() {
            return insuranceNumber;
        }

        public void setInsuranceNumber(String insuranceNumber) {
            this.insuranceNumber = insuranceNumber;
        }

        public Insurance(LocalDate insuranceValidityPeriod, double theCostOfInsurance, String insuranceNumber) {
            this.insuranceValidityPeriod = insuranceValidityPeriod;
            if (insuranceValidityPeriod.isBefore(LocalDate.now())) {
                System.out.println("Нужно срочно ехать оформлять новую страховку!");
            }

            if (insuranceNumber.length() < 9) {
                System.out.println("Номер страховки не правильный");
            }
            this.theCostOfInsurance = theCostOfInsurance;
            this.insuranceNumber = insuranceNumber;
        }
//Номер страховки
    }

    public static class Key {

        private String remoteEngineStart;
        //Удаленный запуск двигателя
        private String keylessAccess;
        //Бесключевой доступ

        public Key(String remoteEngineStart, String keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            if (remoteEngineStart == null) {
                this.remoteEngineStart = "default";
            }
            this.keylessAccess = keylessAccess;
            if (keylessAccess == null) {
                this.keylessAccess = "default";
            }
        }

        //Бесключевой доступ
        public String getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public void setRemoteEngineStart(String remoteEngineStart) {
            this.remoteEngineStart = remoteEngineStart;
            if (remoteEngineStart == null && !remoteEngineStart.isBlank() && !remoteEngineStart.isEmpty()) ;
            {
                this.remoteEngineStart = "default";
            }
        }

        public String getKeylessAccess() {
            return keylessAccess;
        }

        public void setKeylessAccess(String keylessAccess) {
            this.keylessAccess = keylessAccess;
            if (keylessAccess == null && !keylessAccess.isBlank() && !keylessAccess.isEmpty()) ;
            {
                this.keylessAccess = "default";
            }
        }
    }


    public Car(String brand, String model, float engineVolume, String color, int productionYear,
               String productionCountry) {
        this.brand = brand;
        if (brand == null) {
            this.brand = "default";
        }
        this.model = model;
        if (model == null) {
            this.model = "default";
        }
        this.engineVolume = engineVolume;
        if (engineVolume == 0) {
            this.engineVolume = 1.5f;
        }

        this.color = color;
        if (color == null) {
            this.color = "белый";
        }
        this.productionYear = productionYear;
        if (productionYear == 0) {
            this.productionYear = 2000;
        }
        this.productionCountry = productionCountry;
        if (productionCountry == null) {
            this.productionCountry = "default";
        }
    }

    public Car(String brand, String model, float engineVolume, String color, int productionYear,
               String productionCountry, String transmission, String bodyType, String registrationNumber,
               int numberOfSeats, String tires, int monthNumber) {


        this.transmission = transmission;
        if (transmission == null) {
            this.transmission = "default";
        }
        this.bodyType = bodyType;
        if (bodyType == null) {
            this.bodyType = "default";
        }
        this.registrationNumber = registrationNumber;
        if (registrationNumber == null) {
            this.registrationNumber = "default";
        }

        this.brand = brand;
        if (brand == null) {
            this.brand = "default";
        }
        this.model = model;
        if (model == null) {
            this.model = "default";
        }
        this.engineVolume = engineVolume;
        if (engineVolume == 0) {
            this.engineVolume = 1.5f;
        }
        this.color = color;
        if (color == null) {
            this.color = "белый";
        }
        this.productionYear = productionYear;
        if (productionYear == 0) {
            this.productionYear = 2000;
        }
        this.productionCountry = productionCountry;
        if (productionCountry == null) {
            this.productionCountry = "default";
        }
        this.numberOfSeats = numberOfSeats;
        if (numberOfSeats <= 0) {
            this.numberOfSeats = 2;
        } else {
            this.numberOfSeats = Math.abs(numberOfSeats);
        }
        this.tires = tires;
        if (tires == null) {
            this.tires = "default";
        }
        this.monthNumber = monthNumber;
        if (monthNumber <= 0) {
            this.monthNumber = 1;
        } else {
            this.monthNumber = Math.abs(monthNumber);
        }
    }

    public void car() {
        System.out.print(brand + " ");
        System.out.print(model + ", ");
        System.out.print(productionYear + " год выпуска, ");
        System.out.print("сборка " + productionCountry + ", ");
        System.out.print("цвет кузова " + color + ", ");
        System.out.print("объем двигателя " + engineVolume + " литра");
        System.out.println();
    }

    public void allCar() {
        System.out.print(brand + " ");
        System.out.print(model + ", ");
        System.out.print(productionYear + " год выпуска, ");
        System.out.print("сборка " + productionCountry + ", ");
        System.out.print("цвет кузова " + color + ", ");
        System.out.println("объем двигателя " + engineVolume + " литра, ");
        System.out.print("коробка передач " + transmission + " ,");
        System.out.print("тип кузова " + bodyType + " ,");
        System.out.print("регистрационный номер " + registrationNumber + " ,");
        System.out.print("роличество мест " + numberOfSeats + " ,");
        System.out.println("резина " + tires + " ");
        System.out.println();
    }

    public void sumAndWinterTires() {
        switch (this.monthNumber) {
            case 1:
                System.out.println("Сейчас лучше ездить на зимних шинах");
                break;
            case 2:
                System.out.println("Сейчас лучше ездить на зимних шинах");
                break;
            case 3:
                System.out.println("Сейчас лучше ездить на зимних шинах");
                break;
            case 4:
                System.out.println("Сейчас лучше ездить на  летних шинах");
                break;
            case 5:
                System.out.println("Сейчас лучше ездить на  летних шинах");
                break;
            case 6:
                System.out.println("Сейчас лучше ездить на  летних шинах");
                break;
            case 7:
                System.out.println("Сейчас лучше ездить на  летних шинах");
                break;
            case 8:
                System.out.println("Сейчас лучше ездить на  летних шинах");
                break;
            case 9:
                System.out.println("Сейчас лучше ездить на  летних шинах");
                break;
            case 10:
                System.out.println("Сейчас лучше ездить на  летних шинах");
                break;
            case 11:
                System.out.println("Сейчас лучше ездить на зимних шинах");
                break;
            case 12:
                System.out.println("Сейчас лучше ездить на зимних шинах");
        }
    }


    //Добавьте метод проверки, что номер страховки содержит 9 знаков. Если знаков больше или меньше,
    // то вывести сообщение "Номер страховки некорректный!".

    public boolean chekNumberCar() {
        if (registrationNumber.matches("[A-Z]\\d{3}[A-Z]{2}\\d{3}]")) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "Регистрационный знак не верный";
        }
        if (this.registrationNumber.length() < 9) {
//            throw new RuntimeException("Количество цифр в номере не верно");
            System.out.println("Количество символов в номере не верно");
            return false;
        }
        char[] number = this.registrationNumber.toCharArray();
        if (!Character.isAlphabetic(number[0])) {
            System.out.println("Не верные символы в номере");
//    throw new RuntimeException("Не верные символы в номере");
            return false;
        }

        if (!Character.isAlphabetic(number[4])) {
            System.out.println("Не верный 5-й символ в номере");
//            throw new RuntimeException("Не верные символы в номере");
            return false;
        }
        if (!Character.isAlphabetic(number[5])) {
            System.out.println("Не верный 6-й символ в номере");
//            throw new RuntimeException("Не верные символы в номере");
            return false;
        }
        if (!Character.isDefined(number[1])) {
            System.out.println("Не верный 2-й символ в номере");
//            throw new RuntimeException("Не верные символы в номере");
            return false;
        }
        if (!Character.isDefined(number[2])) {
            System.out.println("Не верный 3-й символ в номере");
//            throw new RuntimeException("Не верные символы в номере");
            return false;
        }
        if (!Character.isDefined(number[3])) {
            System.out.println("Не верный 4-й символ в номере");
//            throw new RuntimeException("Не верные символы в номере");
            return false;
        }
        if (!Character.isDefined(number[6])) {
            System.out.println("Не верный 7-й символ в номере");
//            throw new RuntimeException("Не верные символы в номере");
            return false;
        }
        if (!Character.isDefined(number[7])) {
            System.out.println("Не верный 8-й символ в номере");
//            throw new RuntimeException("Не верные символы в номере");
            return false;
        }
        if (!Character.isDefined(number[8])) {
            System.out.println("Не верный 9-й символ в номере");
//            throw new RuntimeException("Не верные символы в номере");
            return false;
        }
        return true;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        if (insurance == null) {
            this.insurance = insurance;
        }
        this.insurance = insurance;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            this.key = key;
        }
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getTires() {
        return tires;
    }

    public void setTires(String tires) {
        this.tires = tires;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getNumberAuto() {
        return numberAuto;
    }

    public void setNumberAuto(String numberAuto) {
        this.numberAuto = numberAuto;
    }
}
