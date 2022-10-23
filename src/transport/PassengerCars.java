package transport;

import java.util.Arrays;
import java.util.Objects;

public class PassengerCars extends Transport implements Competing {
private final BodyTypePassebgerCars bodyTypePassebgerCars;

    public static final String FIRST_SPEED_CHECK_IN_CAR = "Совершить первую поездку без остановок.";
    public static final String SECOND_SPEED_CHECK_IN_CAR = "Совершить вторую поездку с двумя водителями с 1 остановкой.";
    public static final String THIRD_SPEED_CHECK_IN_CAR = "Совершить третью поездку с 2 остановками, с перерывом на обед.";
    public static final String[] MAX_PASSENGER_CAER_SPEED = new String[]{FIRST_SPEED_CHECK_IN_CAR, SECOND_SPEED_CHECK_IN_CAR, THIRD_SPEED_CHECK_IN_CAR};

    public static final String FIRST_STOP_FOR_A_REST = "Перерыв на отых 1";
    public static final String SECOND_STOP_FOR_A_REST = "Перерыв на отдых 2";
    public static final String THIRD_STOP_FOR_A_REST = "Перерыв на отдых 3";

    public static final String[] ALL_STOP_FOR_A_REST = new String[]{FIRST_STOP_FOR_A_REST, SECOND_STOP_FOR_A_REST, THIRD_STOP_FOR_A_REST};

    private String[] bestPassengerCarsTime = new String[0];
    private int numberOfSeats;

    public String[] getBestPassengerCarsTime() {
        return bestPassengerCarsTime;
    }

    public void setBestPassengerCarsTime(String[] bestPassengerCarsTime) {
        this.bestPassengerCarsTime = bestPassengerCarsTime;
    }
//количество мест

    public PassengerCars(String brand, String model,
                         float engineCapacity,
                         int numberOfSeats,
                         BodyTypePassebgerCars getBodyTypePassebgerCars) {
        super(brand, model, engineCapacity);
        setNumberOfSeats(numberOfSeats);
        this.bodyTypePassebgerCars=getBodyTypePassebgerCars;
    }

    public void countPassengers() {
        System.out.println("Поссчитать пассажиров.");
    }


    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
        if (numberOfSeats <= 0) {
            this.numberOfSeats = 10;
        }
    }


    @Override
    public void startMovement() {
        System.out.println("Начать движение закрыв двери");

    }

    @Override
    public void endMovement() {
        System.out.println("Закончить движение открыть двери");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PassengerCars that = (PassengerCars) o;
        return numberOfSeats == that.numberOfSeats;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfSeats);
    }

    @Override
    public void printType() {
        if (bodyTypePassebgerCars == null) {
            System.out.println("Данных не достаточно");
        }else {
            System.out.println("Тип автомобиля- "+bodyTypePassebgerCars);
        }

    }

    public void printPassengerCars() {
        super.printTransport();
        System.out.println("Количество мест " + numberOfSeats);
        countPassengers();
    }


    @Override
    public String[] getPitStop() {
        return ALL_STOP_FOR_A_REST;
    }

    @Override
    public String[] getBestLapTime() {
        return bestPassengerCarsTime;
    }

    @Override
    public String[] getMaximumSpeed() {
        return MAX_PASSENGER_CAER_SPEED;
    }

    @Override
    public void trainMaxSpeed(String checkInForSpeed) {
        System.out.println("Выполняю тренировку Легкового автомобиля");
        switch (checkInForSpeed) {
            case FIRST_SPEED_CHECK_IN_CAR:
                System.out.println("Отработана первая поездка по маршруту.");
                break;
            case SECOND_SPEED_CHECK_IN_CAR:
                System.out.println("Отработана вторая поездка с 1 остановкой.");
                System.out.println("Совершане остановка,  произведена смена водителя на маршруте.");
                break;
            case THIRD_SPEED_CHECK_IN_CAR:
                System.out.println("Совершена третья поездка.");
                System.out.println("Первая остановка- сменился водитель.");
                System.out.println("Вторая оставновка- водители пообедали.");
                break;
            default:
                System.out.println("Маршрут не задан.");


        }
    }


    @Override
    public void trainlaptime(String lapTime) {
        bestPassengerCarsTime = Arrays.copyOf(getBestLapTime(), getBestLapTime().length + 1);
        getBestLapTime()[getBestLapTime().length - 1] = lapTime;
        System.out.println("Время поездки составило:" + lapTime);
    }

    @Override
    public void trainPitStop(String pitStop) {
        System.out.println("Отраюабатываются остановки в пути легкового транспорта.");
        switch (pitStop) {
            case FIRST_STOP_FOR_A_REST:
                System.out.println("Совершаю первую остановку в пути");
                break;
            case SECOND_STOP_FOR_A_REST:
                System.out.println("Совершаю вторую остановку в пути.");
                System.out.println("Обедаю, заправляюсь.");
                break;
            case THIRD_STOP_FOR_A_REST:
                System.out.println("Совершаю тертью остановку в пути.");
                System.out.println("Отдыхаю, заправляюсью");
                break;
            default:
                System.out.println("Остановка не предусмотрена.");

        }
    }
}

