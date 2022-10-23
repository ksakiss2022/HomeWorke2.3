package transport;

import java.util.Arrays;
import java.util.Objects;

public class TrucksCar extends Transport implements Competing {
    private String color;
    public static final String FIRST_SPEED_CHECK_IN = "Совершить первый заезд на скорость на треке.";
    public static final String SECOND_SPEED_CHECK_IN = "Совершить второй заезд на скорость по горной метности.";
    public static final String THIRD_SPEED_CHECK_IN = "Совершить третий заезд на скорость по пересеченной местности.";
    public static final String[] MAX_SPEED = new String[]{FIRST_SPEED_CHECK_IN, SECOND_SPEED_CHECK_IN, THIRD_SPEED_CHECK_IN};
    public static final String FIRST_PIT_STOP = "1 перерыв на обед";
    public static final String SECOND_PIT_STOP = "2 перерыв на отдых";
    public static final String THIRD_PIT_STOP = "3 перерыв на ужин";

    public static final String[] ALL_PIT_STOP = new String[]{FIRST_PIT_STOP, SECOND_PIT_STOP, THIRD_PIT_STOP};
    private String[] bestTime = new String[0];

    public String[] getBestTime() {
        return bestTime;
    }

    public void setBestTime(String[] bestTime) {
        this.bestTime = bestTime;
    }

    public TrucksCar(String brand, String model, float engineCapacity, String color) {
        super(brand, model, engineCapacity);
        setColor(color);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TrucksCar trucksCar = (TrucksCar) o;
        return Objects.equals(color, trucksCar.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }

    public void turnOnTheHeadlights() {
        System.out.println("При движении необходимо включать фары.");

    }
    //включить фары

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        if (color == null && !color.isEmpty() && !color.isBlank()) {
        }

    }


    @Override
    public void startMovement() {
        System.out.println("Начать движение.");

    }

    @Override
    public void endMovement() {
        System.out.println("Закончить движение.");

    }

    public void printTrucksCar() {
        super.printTransport();
        System.out.println("Цвет автомобиля- " + color + ", ");
        startMovement();
        endMovement();
        turnOnTheHeadlights();
    }


    @Override
    public String[] getPitStop() {
        return ALL_PIT_STOP;
    }


    @Override
    public String[] getBestLapTime() {
        return bestTime;
    }

    @Override
    public String[] getMaximumSpeed() {
        return MAX_SPEED;
    }

    @Override
    public void trainMaxSpeed(String checkInForSpeed) {
        System.out.println("Выполняю тренировку Грузового транспорта.");
        switch (checkInForSpeed) {
            case FIRST_SPEED_CHECK_IN:
                System.out.println("Отработана тренировка на треке на максимальную скорость.");
                System.out.println("Зафиксирован лучший результат.");
                break;
            case SECOND_SPEED_CHECK_IN:
                System.out.println("Отработана тренировка на скорость в условиях горной местности.");
                System.out.println("Достигнута максимальная скорость, зафиксирован результат.");
                break;
            case THIRD_SPEED_CHECK_IN:
                System.out.println("Отработана тренировка на максимальную скорость по пересеченной местности");
                break;
            default:
                System.out.println("Нет такой тренировки");
        }

    }


    @Override
    public void trainlaptime(String lapTime) {
        bestTime = Arrays.copyOf(bestTime, bestTime.length + 1);
        bestTime[bestTime.length - 1] = lapTime;
        System.out.println("Время на выполнение тренировки составило- " + lapTime);
    }

    @Override
    public void trainPitStop(String pitStop) {
        System.out.println("Пит-Стоп для Грузового транспорта.");
        switch (pitStop) {
            case FIRST_PIT_STOP:
                System.out.println("Пит-Стоп 1.");
                break;
            case SECOND_PIT_STOP:
                System.out.println("Пит-Сто 2.");
                break;
            case THIRD_PIT_STOP:
                System.out.println("Пит стоп 3.");

                break;
            default:
                System.out.println("Не предусмотрен Пит-Стоп.");


        }

    }
}