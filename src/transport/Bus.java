package transport;

public class Bus extends Transport {
    public Bus(String brand,
               String model,
               int productionYear,
               String productionCountry,
               String color,
               int movementSpeed) {
        super(brand, model, productionYear, productionCountry, color, movementSpeed);

    }

    @Override
    public void refill() {
        System.out.println("Заправлять бензином или дизелем на заправке.");
    }

    public void bus() {
        super.transport();
    }

}
