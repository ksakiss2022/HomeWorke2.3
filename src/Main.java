//import animals.*;
//import animals.NotFlying;
//import transport.Bus;
//import transport.Car;
//import transport.Train;

import Driver.DriverB;
import Driver.DriverC;
import Driver.DriverD;
import transport.*;


public class Main {
    public static void main(String[] args) {

        TrucksCar zil = new TrucksCar("Зил",
                "4",
                5.0f,
                "Синий",
                CapacityTruck.N1);
//        zil.printTransport();
//        zil.turnOnTheHeadlights();
//        zil.trainMaxSpeed(TrucksCar.FIRST_SPEED_CHECK_IN);
//        zil.trainlaptime("2 часа 45 минут");
//        zil.trainMaxSpeed(TrucksCar.SECOND_SPEED_CHECK_IN);
//        zil.trainlaptime("3 часа 45 минут");
//        zil.trainMaxSpeed(TrucksCar.THIRD_SPEED_CHECK_IN);
//        zil.trainlaptime("5 часов 5 минут");
        zil.printType();
        System.out.println();
        TrucksCar ural = new TrucksCar("Урал",
                "2",
                5.0f,
                "белый",
                CapacityTruck.N3);
//        ural.printTransport();
//        ural.turnOnTheHeadlights();
        ural.printType();
        System.out.println();
        TrucksCar kamaz = new TrucksCar("Skoda",
                "coroc",
                1.4f,
                "серый",
                CapacityTruck.N2);
//        kamaz.printTransport();
//        kamaz.turnOnTheHeadlights();
//        kamaz.trainlaptime(" 20:22 ");
        kamaz.printType();
        System.out.println();
        TrucksCar gaz = new TrucksCar("Hynday",
                "accent",
                2.0f,
                "красный",
                CapacityTruck.N1);
//        gaz.printTransport();
//        gaz.turnOnTheHeadlights();
//        gaz.trainPitStop(TrucksCar.FIRST_PIT_STOP);
//        gaz.trainPitStop(TrucksCar.SECOND_PIT_STOP);
//        gaz.trainPitStop(TrucksCar.THIRD_PIT_STOP);
        gaz.printType();
        System.out.println();

        PassengerCars honda = new PassengerCars("Хонда",
                "2.0",
                2.0f,
                4,
                BodyTypePassebgerCars.SEDAN);
//        honda.printPassengerCars();
//        honda.startMovement();
//        honda.trainMaxSpeed(PassengerCars.FIRST_SPEED_CHECK_IN_CAR);
//        honda.trainPitStop(PassengerCars.FIRST_STOP_FOR_A_REST);
//        honda.trainlaptime("1 день ");
//        honda.trainMaxSpeed(PassengerCars.SECOND_SPEED_CHECK_IN_CAR);
//        honda.trainPitStop(PassengerCars.FIRST_STOP_FOR_A_REST);
//        honda.trainPitStop(PassengerCars.SECOND_STOP_FOR_A_REST);
//        honda.trainlaptime("1.5 дня ");
//        honda.trainMaxSpeed(PassengerCars.THIRD_SPEED_CHECK_IN_CAR);
//        honda.trainPitStop(PassengerCars.FIRST_STOP_FOR_A_REST);
//        honda.trainPitStop(PassengerCars.SECOND_STOP_FOR_A_REST);
//        honda.trainPitStop(PassengerCars.THIRD_STOP_FOR_A_REST);
//        honda.trainlaptime("2 дня ");
        honda.printType();
        System.out.println();
        PassengerCars bmw = new PassengerCars("БМВ",
                "Х5",
                5.0f,
                6,
                BodyTypePassebgerCars.PICKUP_TRUCK);
//        bmw.printPassengerCars();
//        bmw.startMovement();
        bmw.printType();
        System.out.println();
        PassengerCars skoda = new PassengerCars("Шкода",
                "карок",
                1.4f,
                4,
                BodyTypePassebgerCars.MINIVAN);
//        skoda.printPassengerCars();
//        skoda.startMovement();
        skoda.printType();
        System.out.println();
        PassengerCars hyunday = new PassengerCars("Хюндай",
                "аксцент",
                2.0f,
                5,
                BodyTypePassebgerCars.VAN);
//        hyunday.printPassengerCars();
//        hyunday.startMovement();
        hyunday.printType();
        System.out.println();

        Bus mersedecBus = new Bus("Автобус Мерседес", "222", 3.30f, 65,BusCapacity.BIG);
//        mersedecBus.printBus();
//        mersedecBus.trainMaxSpeed(Bus.FIRST_SPEED_CHECK_IN_BUS);
//        mersedecBus.trainlaptime("1 час 10 минут");
//        mersedecBus.trainMaxSpeed(Bus.SECOND_SPEED_CHECK_IN_BUS);
//        mersedecBus.trainlaptime("1 час 55 минут");
//        mersedecBus.trainMaxSpeed(Bus.THIRD_SPEED_CHECK_IN_BUS);
//        mersedecBus.trainlaptime("2 часа");
        mersedecBus.printType();
        System.out.println();
        Bus hondaBus = new Bus("Автобу хонда",
                "23",
                4.0f,
                55,
                BusCapacity.AVERAGE);
//        hondaBus.printBus();
        System.out.println();
        Bus gazellBus = new Bus("Автобус газель",
                "газ2",
                4.4f,
                66,
                BusCapacity.ESPECIALLY_SMALL);
//        gazellBus.printBus();
//        gazellBus.trainlaptime("11:35");
        gazellBus.printType();
        System.out.println();
        Bus liazBus = new Bus("Автобус лиаз",
                "лиаз3",
                3.0f,
                35,
                BusCapacity.ESPECIALLY_SMALL);
//        liazBus.printBus();
//        liazBus.trainPitStop(Bus.FIRST_TAKE_A_BREAK);
//        liazBus.trainPitStop(Bus.SECOND_TAKE_A_BREAK);
//        liazBus.trainPitStop(Bus.THIRD_TAKE_A_BREAK);
        liazBus.printType();
        System.out.println();

//        chekCompeting(ural, bmw, hondaBus);
//        System.out.println();
//
//        checkTrainPitStop(kamaz, skoda, gazellBus);
//        System.out.println();
//
//        DriverC zurab = new DriverC("Зураб", 'C', 15, ural);
//        zurab.printDriver();
//        DriverB mihail = new DriverB("Михаил", 'B', 24, honda);
//        mihail.printDriver();
//        DriverD oleg = new DriverD("Олег", 'D', 12, liazBus);
//        oleg.printDriver();
//
//    }
//
//    public static void chekCompeting(Competing... allTransports) {
//        for (Competing allTransport : allTransports) {
//            for (String maxSpeed : allTransport.getMaximumSpeed()) {
//                allTransport.trainMaxSpeed(maxSpeed);
//
//            }
//        }
//    }
//
//    public static void checkTrainPitStop(Competing... checkPitStops) {
//        for (Competing checkPitStop : checkPitStops) {
//            for (String pitStop : checkPitStop.getPitStop()) {
//                checkPitStop.trainPitStop(pitStop);
//            }
//
//        }

 }
}


//        Flying seagull = new Flying("Чайка Вова",
//                2021,
//                "Обитает на территории Европы, во Франции, в Англии, Дании, Шотландии, везде, " +
//                        "где есть открытый выход к морю или океану, а так же на внутренних территориях." +
//                        " Они живут в Азии, России, Китае, Японии, Австралии, Африке, Индии, " +
//                        "Северной и Южной Америке, возле Аляски и Канады, ОАЭ, отдельных островах.",
//                "Летает по небу");
//        seagull.printFlying();
//        System.out.println();
//
//
//        Flying albatross = new Flying("Альбатрос Петрович",
//                2022,
//                "Обитает  в Южном океане (воды вокруг Антарктиды) и в северной части Тихого океана",
//                "Летает по небу");
//        albatross.printFlying();
//        System.out.println(albatross.equals(seagull));
//        System.out.println();
//
//        Flying falcon = new Flying("Сокол Тимон",
//                2022,
//                "Обитает  в пустынях, тундре, тайге, лугах, саваннах, кустарниковых лесах, горах, прибрежных" +
//                        " районах, водно-болотных угодьях, устьях рек, берегах озер, сельскохозяйственных районах, " +
//                        "пригородах и городах",
//                "Летает по небу");
//        falcon.printFlying();
//        System.out.println(albatross.equals(falcon));
//        System.out.println(seagull.equals(falcon));
//        System.out.println();
//
//
//        NotFlying peacock = new NotFlying("Павлин Сеня",
//                2000,
//                "Обитает в джунглях и лесистых местностях",
//                "Передвигается по земле и деревьям");
//        peacock.printNotFlying();
//        System.out.println();
//
//        NotFlying penguin = new NotFlying("Пингвиниха Валя",
//                2021,
//                "Обитает в открытом море Южного полушария",
//                "Ходят медленно, переваливаясь с боку на бок, по льду и снегу – скользят, " +
//                        "лежа на брюхе, отличные плавцы");
//        penguin.printNotFlying();
//        System.out.println(penguin.equals(peacock));
//        System.out.println();
//
//        NotFlying dodoBird = new NotFlying("Птица До-До Мария",
//                2015,
//                "Обитает на островах к востоку от Мадагаскара, которые сегодня называются Маскаренским архипелагом",
//                "Вымерший вид");
//        dodoBird.printNotFlying();
//        System.out.println(penguin.equals(dodoBird));
//        System.out.println(peacock.equals(dodoBird));
//        System.out.println();
//
//
//
//
//        Amphibious frog = new Amphibious("Лягушка Маня",
//                2022,
//                "Реки, озера, пруды, леса");
//        frog.printAmphibious();
//        System.out.println();
//
//        Amphibious isAnAmphibian = new Amphibious("Уж земноводный Сергей",
//                2022,
//                "Реки, озера, пруды, леса");
//        isAnAmphibian.printAmphibious();
//        System.out.println(frog.equals(isAnAmphibian));
//        System.out.println();
//
//
//
//        Herbivores giraffe = new Herbivores("Жираф Мелман",
//                2000,
//                "Саванна",
//                20,
//                " кустарники и деревья");
//        giraffe.printHerbivores();
//        System.out.println();
//
//
//        Herbivores gazelle = new Herbivores("Газель Зуля",
//                1999,
//                "Саванна",
//                25,
//                " трава, кустарники");
//        gazelle.printHerbivores();
//        System.out.println(giraffe.equals(gazelle));
//        System.out.println();
//
//        Herbivores horse = new Herbivores("Конь Пегас",
//                2021,
//                "Саванна",
//                30,
//                " трава, кустарники");
//        horse.printHerbivores();
//        System.out.println(giraffe.equals(horse));
//        System.out.println(gazelle.equals(horse));
//        System.out.println();
//
//
//        Predators hyena = new Predators("Гиена Джек",
//                2000,
//                "Саванна",
//                20,
//                " мясо");
//        hyena.printPredators();
//        System.out.println();
//
//        Predators tiger = new Predators("Тигр Шерхан",
//                1998,
//                "Саванна",
//                24,
//                " мясо");
//        tiger.printPredators();
//        System.out.println(hyena.equals(tiger));
//        System.out.println();
//
//        Predators bear = new Predators("Медведь Балу",
//                1996,
//                "Лес",
//                15,
//                " мясо, рыба, ягоды, падаль");
//        bear.printPredators();
//        System.out.println(hyena.equals(bear));
//        System.out.println(tiger.equals(bear));
//        System.out.println();
//

//        Bus bluBuss = new Bus("Синий автобу",
//                "Mersedes",
//                2020,
//                "Германия",
//                "синий",
//                110);
//        bluBuss.bus();
//        bluBuss.refill();
//        System.out.println();
//
//        Bus redBus = new Bus("Красный автобу",
//                "Газель",
//                2021,
//                "Россия",
//                "красный",
//                95);
//        redBus.bus();
//        redBus.refill();
//        System.out.println();
//
//        Bus yelloyBus = new Bus("Желтый автобу",
//                "Kia",
//                2018,
//                "Россия",
//                "желтый",
//                120);
//        yelloyBus.bus();
//        yelloyBus.refill();
//        System.out.println();

//  //Количество вагонов
////Поезд «Ласточка», модель B-901, 2011 год выпуска в России, скорость передвижения — 301 км/ч, отходит от
//// Белорусского вокзала и следует до станции Минск-Пассажирский. Цена поездки — 3500 рублей,
// в поезде 11 вагонов.
//
//        Train lastocha = new Train(" Поезд Ласточка",
//                "B-901",
//                2011,
//                " Россия",
//                301,
//                3500,
//                "Белорусского вокзала",
//                "Минск-Пассажирский",
//                15);
//
//        lastocha.train();
//        lastocha.refill();
//        System.out.println();
//
//
//        Train leningrad = new Train("Поезд Ленинград",
//                "D-125",
//                2019,
//                " Россия",
//                270,
//                1700,
//                "Ленинградского вокзала",
//                "Ленинград-Пассажирский",
//                8);
//
//        leningrad.train();
//        leningrad.refill();
//        System.out.println();


//        Human maksim = new Human(35, "Максим", "Минск", " бренд-менеджерa");
//        maksim.human();
//
//        Human anna = new Human(29, "Анна", "Москва", " методистa образовательных программ");
//        anna.human();
//
//        Human katya = new Human(28, "Катя", "Калининград", " продакт-менеджера");
//        katya.human();
//
//        Human artem = new Human(27, "Артем", "Москва", " директора по развитию бизнеса");
//        artem.human();
//
//        Human vladimir = new Human(21, "Владимир", "Казань", null);
//        vladimir.human();
//
//        Human checkingForNullHuman = new Human(-3, null, null, null);
//        checkingForNullHuman.human();


//        Car.Key carManagement = new Car.Key(true,
//                false);
//        Car.Insurance carInsurance = new Car.Insurance(null, 3550.50, "123456789");
//
//        Car ladaGrande = new Car
//                ("Lada",
//                        "Grande",
//                        2022,
//                        "России",
//                        "желтый",
//                        110);
//        ladaGrande.setKey(carManagement);
//        ladaGrande.car();
//        Car.Insurance ladaGrandeInsurance = new Car.Insurance(null, 4321.90,
//                "987654321");
//        ladaGrande.setInsurance(ladaGrandeInsurance);
//        System.out.println(carManagement.getKeylessAccess());
//        System.out.println(carManagement.getRemoteEngineStart());
//        System.out.println("Номер страховки- " + ladaGrandeInsurance.getInsuranceNumber() + ","
//                + " стоимость страховки- " + ladaGrandeInsurance.getTheCostOfInsurance() +
//                "," + " срок дейстрия страховки- " + ladaGrandeInsurance.getInsuranceValidityPeriod());
//        ladaGrande.refill();
//        System.out.println();
//
//
//        Car audi = new Car("Audi A8 50 L TDI",
//                "quattro",
//                2021,
//                "Германия",
//                "черный",
//                150);
//        audi.car();
//        Car.Insurance audiInsurance = new Car.Insurance(null, 5555.40,
//                "111111111");
//        audi.setInsurance(audiInsurance);
//        System.out.println("Номер страховки- " + audiInsurance.getInsuranceNumber() + ","
//                + " стоимость страховки- " + audiInsurance.getTheCostOfInsurance() +
//                "," + " срок дейстрия страховки- " + audiInsurance.getInsuranceValidityPeriod());
//        audi.refill();
//        System.out.println();
//
//        Car bmw = new Car("BMW",
//                "Z8",
//                1990,
//                "Германия",
//                "черный",
//                2022);
//        bmw.car();
//        Car.Insurance bmwInsurance = new Car.Insurance(null, 4444.40,
//                "222222222");
//        audi.setInsurance(bmwInsurance);
//        System.out.println("Номер страховки- " + bmwInsurance.getInsuranceNumber() + ","
//                + " стоимость страховки- " + bmwInsurance.getTheCostOfInsurance() +
//                "," + " срок дейстрия страховки- " + bmwInsurance.getInsuranceValidityPeriod());
//        bmw.refill();
//        System.out.println();
//
//        Car kia = new Car("Kia",
//                "Sportage 4 поколение",
//                2000,
//                "Южная Корея",
//                "красный",
//                200);
//        kia.car();
//        Car.Insurance kiaInsurance = new Car.Insurance(null, 3333.56,
//                "333333333");
//        audi.setInsurance(kiaInsurance);
//        System.out.println("Номер страховки- " + kiaInsurance.getInsuranceNumber() + ","
//                + " стоимость страховки- " + kiaInsurance.getTheCostOfInsurance() +
//                "," + " срок дейстрия страховки- " + kiaInsurance.getInsuranceValidityPeriod());
//        kia.refill();
//        System.out.println();
//
//        Car hyundai = new Car("Hyundai",
//                "Avante",
//                2001,
//                "Южная Корея",
//                "оранжевый",
//                150);
//        hyundai.car();
//        Car.Insurance hyundayInsurance = new Car.Insurance(null, 6666.00,
//                "444444444");
//        audi.setInsurance(hyundayInsurance);
//        System.out.println("Номер страховки- " + hyundayInsurance.getInsuranceNumber() + ","
//                + " стоимость страховки- " + hyundayInsurance.getTheCostOfInsurance() +
//                "," + " срок дейстрия страховки- " + hyundayInsurance.getInsuranceValidityPeriod());
//        hyundai.refill();
//        System.out.println();
//
//        Car checkingForNull = new Car(null, null, 0, null, null,
//                0);
//        checkingForNull.car();
//        checkingForNull.refill();

//        Flower rose = new Flower("Роза обыкновенная", "Голландия", 35.59f, 9);
//        rose.printflower();
//
//        Flower hresantem = new Flower("Хризантема", " ", 15f, 5);
//        hresantem.printflower();
//
//        Flower pion = new Flower("Пион", "Англия", 69.9f, 4);
//        pion.printflower();
//
//        Flower gibiscus = new Flower("Гипсофила", "Турция", 19.5f, 10);
//        gibiscus.printflower();
//        Flower[] flowers = new Flower[20];
//        flowers[0] = rose;
//        flowers[1] = hresantem;
//        flowers[2] = pion;
//        flowers[3] = gibiscus;
//
//        calculate(flowers);

//        Car skodaCadiac = new Car("Skoda",
//                "Cadiac", 2021,
//                "России", "синий", 150);
//
//        skodaCadiac.allCar();


//   }


//    public static void calculate(Flower[] flowers) {
//        int lifeSpan = Integer.MAX_VALUE;
//        float sum = 0;
//        String text = "В букете есть:\n";
//        for (int i = 0; i < flowers.length; i++) {
//            if (flowers[i] != null) {
//                text += " " + flowers[i].getFlowerColorName() + " " + "из " + flowers[i].getCountry() + "\n";
//                if (flowers[i].getLifeSpan() < lifeSpan) {
//                    lifeSpan = flowers[i].getLifeSpan();
//                }
//                sum += flowers[i].getCost();
//            }
//   //     }
//        sum = sum * 1.10f;
//        text += "\n";
//        text += "Сумма букета = " + String.format("%.2f", sum);
//        text += "\n";
//        text += "Срок годности:" + lifeSpan;
//        System.out.println(text);

//    }
//
