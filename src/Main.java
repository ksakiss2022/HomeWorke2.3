import animals.*;
import animals.NotFlying;
import transport.Bus;
import transport.Car;
import transport.Train;
import transport.Transport;

import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {
        Flying seagull = new Flying("Чайка Вова",
                2021,
                "Обитает на территории Европы, во Франции, в Англии, Дании, Шотландии, везде, " +
                        "где есть открытый выход к морю или океану, а так же на внутренних территориях." +
                        " Они живут в Азии, России, Китае, Японии, Австралии, Африке, Индии, " +
                        "Северной и Южной Америке, возле Аляски и Канады, ОАЭ, отдельных островах.",
                "Летает по небу");
        seagull.printFlying();
        System.out.println();


        Flying albatross = new Flying("Альбатрос Петрович",
                2022,
                "Обитает  в Южном океане (воды вокруг Антарктиды) и в северной части Тихого океана",
                "Летает по небу");
        albatross.printFlying();
        System.out.println(albatross.equals(seagull));
        System.out.println();

        Flying falcon = new Flying("Сокол Тимон",
                2022,
                "Обитает  в пустынях, тундре, тайге, лугах, саваннах, кустарниковых лесах, горах, прибрежных" +
                        " районах, водно-болотных угодьях, устьях рек, берегах озер, сельскохозяйственных районах, " +
                        "пригородах и городах",
                "Летает по небу");
        falcon.printFlying();
        System.out.println(albatross.equals(falcon));
        System.out.println(seagull.equals(falcon));
        System.out.println();


        NotFlying peacock = new NotFlying("Павлин Сеня",
                2000,
                "Обитает в джунглях и лесистых местностях",
                "Передвигается по земле и деревьям");
        peacock.printNotFlying();
        System.out.println();

        NotFlying penguin = new NotFlying("Пингвиниха Валя",
                2021,
                "Обитает в открытом море Южного полушария",
                "Ходят медленно, переваливаясь с боку на бок, по льду и снегу – скользят, " +
                        "лежа на брюхе, отличные плавцы");
        penguin.printNotFlying();
        System.out.println(penguin.equals(peacock));
        System.out.println();

        NotFlying dodoBird = new NotFlying("Птица До-До Мария",
                2015,
                "Обитает на островах к востоку от Мадагаскара, которые сегодня называются Маскаренским архипелагом",
                "Вымерший вид");
        dodoBird.printNotFlying();
        System.out.println(penguin.equals(dodoBird));
        System.out.println(peacock.equals(dodoBird));
        System.out.println();




        Amphibious frog = new Amphibious("Лягушка Маня",
                2022,
                "Реки, озера, пруды, леса");
        frog.printAmphibious();
        System.out.println();

        Amphibious isAnAmphibian = new Amphibious("Уж земноводный Сергей",
                2022,
                "Реки, озера, пруды, леса");
        isAnAmphibian.printAmphibious();
        System.out.println(frog.equals(isAnAmphibian));
        System.out.println();



        Herbivores giraffe = new Herbivores("Жираф Мелман",
                2000,
                "Саванна",
                20,
                " кустарники и деревья");
        giraffe.printHerbivores();
        System.out.println();


        Herbivores gazelle = new Herbivores("Газель Зуля",
                1999,
                "Саванна",
                25,
                " трава, кустарники");
        gazelle.printHerbivores();
        System.out.println(giraffe.equals(gazelle));
        System.out.println();

        Herbivores horse = new Herbivores("Конь Пегас",
                2021,
                "Саванна",
                30,
                " трава, кустарники");
        horse.printHerbivores();
        System.out.println(giraffe.equals(horse));
        System.out.println(gazelle.equals(horse));
        System.out.println();


        Predators hyena = new Predators("Гиена Джек",
                2000,
                "Саванна",
                20,
                " мясо");
        hyena.printPredators();
        System.out.println();

        Predators tiger = new Predators("Тигр Шерхан",
                1998,
                "Саванна",
                24,
                " мясо");
        tiger.printPredators();
        System.out.println(hyena.equals(tiger));
        System.out.println();

        Predators bear = new Predators("Медведь Балу",
                1996,
                "Лес",
                15,
                " мясо, рыба, ягоды, падаль");
        bear.printPredators();
        System.out.println(hyena.equals(bear));
        System.out.println(tiger.equals(bear));
        System.out.println();


        Bus bluBuss = new Bus("Синий автобу",
                "Mersedes",
                2020,
                "Германия",
                "синий",
                110);
        bluBuss.bus();
        bluBuss.refill();
        System.out.println();

        Bus redBus = new Bus("Красный автобу",
                "Газель",
                2021,
                "Россия",
                "красный",
                95);
        redBus.bus();
        redBus.refill();
        System.out.println();

        Bus yelloyBus = new Bus("Желтый автобу",
                "Kia",
                2018,
                "Россия",
                "желтый",
                120);
        yelloyBus.bus();
        yelloyBus.refill();
        System.out.println();

        //  //Количество вагонов
        ////Поезд «Ласточка», модель B-901, 2011 год выпуска в России, скорость передвижения — 301 км/ч, отходит от
        //// Белорусского вокзала и следует до станции Минск-Пассажирский. Цена поездки — 3500 рублей,
        // в поезде 11 вагонов.

        Train lastocha = new Train(" Поезд Ласточка",
                "B-901",
                2011,
                " Россия",
                301,
                3500,
                "Белорусского вокзала",
                "Минск-Пассажирский",
                15);

        lastocha.train();
        lastocha.refill();
        System.out.println();


        Train leningrad = new Train("Поезд Ленинград",
                "D-125",
                2019,
                " Россия",
                270,
                1700,
                "Ленинградского вокзала",
                "Ленинград-Пассажирский",
                8);

        leningrad.train();
        leningrad.refill();
        System.out.println();


        Human maksim = new Human(35, "Максим", "Минск", " бренд-менеджерa");
        maksim.human();

        Human anna = new Human(29, "Анна", "Москва", " методистa образовательных программ");
        anna.human();

        Human katya = new Human(28, "Катя", "Калининград", " продакт-менеджера");
        katya.human();

        Human artem = new Human(27, "Артем", "Москва", " директора по развитию бизнеса");
        artem.human();

        Human vladimir = new Human(21, "Владимир", "Казань", null);
        vladimir.human();

        Human checkingForNullHuman = new Human(-3, null, null, null);
        checkingForNullHuman.human();


        Car.Key carManagement = new Car.Key(true,
                false);
        Car.Insurance carInsurance = new Car.Insurance(null, 3550.50, "123456789");

        Car ladaGrande = new Car
                ("Lada",
                        "Grande",
                        2022,
                        "России",
                        "желтый",
                        110);
        ladaGrande.setKey(carManagement);
        ladaGrande.car();
        Car.Insurance ladaGrandeInsurance = new Car.Insurance(null, 4321.90,
                "987654321");
        ladaGrande.setInsurance(ladaGrandeInsurance);
        System.out.println(carManagement.getKeylessAccess());
        System.out.println(carManagement.getRemoteEngineStart());
        System.out.println("Номер страховки- " + ladaGrandeInsurance.getInsuranceNumber() + ","
                + " стоимость страховки- " + ladaGrandeInsurance.getTheCostOfInsurance() +
                "," + " срок дейстрия страховки- " + ladaGrandeInsurance.getInsuranceValidityPeriod());
        ladaGrande.refill();
        System.out.println();


        Car audi = new Car("Audi A8 50 L TDI",
                "quattro",
                2021,
                "Германия",
                "черный",
                150);
        audi.car();
        Car.Insurance audiInsurance = new Car.Insurance(null, 5555.40,
                "111111111");
        audi.setInsurance(audiInsurance);
        System.out.println("Номер страховки- " + audiInsurance.getInsuranceNumber() + ","
                + " стоимость страховки- " + audiInsurance.getTheCostOfInsurance() +
                "," + " срок дейстрия страховки- " + audiInsurance.getInsuranceValidityPeriod());
        audi.refill();
        System.out.println();

        Car bmw = new Car("BMW",
                "Z8",
                1990,
                "Германия",
                "черный",
                2022);
        bmw.car();
        Car.Insurance bmwInsurance = new Car.Insurance(null, 4444.40,
                "222222222");
        audi.setInsurance(bmwInsurance);
        System.out.println("Номер страховки- " + bmwInsurance.getInsuranceNumber() + ","
                + " стоимость страховки- " + bmwInsurance.getTheCostOfInsurance() +
                "," + " срок дейстрия страховки- " + bmwInsurance.getInsuranceValidityPeriod());
        bmw.refill();
        System.out.println();

        Car kia = new Car("Kia",
                "Sportage 4 поколение",
                2000,
                "Южная Корея",
                "красный",
                200);
        kia.car();
        Car.Insurance kiaInsurance = new Car.Insurance(null, 3333.56,
                "333333333");
        audi.setInsurance(kiaInsurance);
        System.out.println("Номер страховки- " + kiaInsurance.getInsuranceNumber() + ","
                + " стоимость страховки- " + kiaInsurance.getTheCostOfInsurance() +
                "," + " срок дейстрия страховки- " + kiaInsurance.getInsuranceValidityPeriod());
        kia.refill();
        System.out.println();

        Car hyundai = new Car("Hyundai",
                "Avante",
                2001,
                "Южная Корея",
                "оранжевый",
                150);
        hyundai.car();
        Car.Insurance hyundayInsurance = new Car.Insurance(null, 6666.00,
                "444444444");
        audi.setInsurance(hyundayInsurance);
        System.out.println("Номер страховки- " + hyundayInsurance.getInsuranceNumber() + ","
                + " стоимость страховки- " + hyundayInsurance.getTheCostOfInsurance() +
                "," + " срок дейстрия страховки- " + hyundayInsurance.getInsuranceValidityPeriod());
        hyundai.refill();
        System.out.println();

        Car checkingForNull = new Car(null, null, 0, null, null,
                0);
        checkingForNull.car();
        checkingForNull.refill();

        Flower rose = new Flower("Роза обыкновенная", "Голландия", 35.59f, 9);
        rose.printflower();

        Flower hresantem = new Flower("Хризантема", " ", 15f, 5);
        hresantem.printflower();

        Flower pion = new Flower("Пион", "Англия", 69.9f, 4);
        pion.printflower();

        Flower gibiscus = new Flower("Гипсофила", "Турция", 19.5f, 10);
        gibiscus.printflower();
        Flower[] flowers = new Flower[20];
        flowers[0] = rose;
        flowers[1] = hresantem;
        flowers[2] = pion;
        flowers[3] = gibiscus;

        calculate(flowers);

        Car skodaCadiac = new Car("Skoda",
                "Cadiac", 2021,
                "России", "синий", 150);

        skodaCadiac.allCar();
        skodaCadiac.chekNumberCar();


    }


    public static void calculate(Flower[] flowers) {
        int lifeSpan = Integer.MAX_VALUE;
        float sum = 0;
        String text = "В букете есть:\n";
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i] != null) {
                text += " " + flowers[i].getFlowerColorName() + " " + "из " + flowers[i].getCountry() + "\n";
                if (flowers[i].getLifeSpan() < lifeSpan) {
                    lifeSpan = flowers[i].getLifeSpan();
                }
                sum += flowers[i].getCost();
            }
        }
        sum = sum * 1.10f;
        text += "\n";
        text += "Сумма букета = " + String.format("%.2f", sum);
        text += "\n";
        text += "Срок годности:" + lifeSpan;
        System.out.println(text);

    }

}