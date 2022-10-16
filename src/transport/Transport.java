package transport;

public abstract class Transport {
    protected String brand;
    protected String model;
    protected int productionYear;
    protected String productionCountry;
    protected String color;

    public Transport(String brand,
                     String model,
                     int productionYear,
                     String productionCountry,
                     int movementSpeed) {
        setBrand(brand);
        setModel(model);
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        setMovementSpeed(movementSpeed);
    }

    private int movementSpeed;

    public Transport(String brand,
                     String model,
                     int productionYear,
                     String productionCountry,
                     String color,
                     int movementSpeed) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        if (productionYear <= 0) {
            this.productionYear = 2000;
        }
        this.productionCountry = productionCountry;
        if (productionCountry == null) {
            this.productionCountry = "страна производства не задана";
        }
        this.color = color;
        this.movementSpeed = movementSpeed;
    }


    public abstract void refill();


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
        if (brand == null) {
            this.brand = "default";
        }
    }

    public String getModel() {
        return model;

    }

    public void setModel(String model) {
        this.model = model;
        if (model == null) {
            this.model = "default";
        }
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        if (color == null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        } else {
            this.color = "Информация не указана";
        }
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }


    public void setMovementSpeed(int movementSpeed) {
        this.movementSpeed = movementSpeed;
        if (movementSpeed <= 0) {
            this.movementSpeed = 100;
        }
    }

    public void transport() {

        System.out.print("Вид трансорта " + getBrand() + ", ");
        System.out.print("модель " + getModel() + ", ");
        System.out.print("год выпуска " + getProductionYear() + ", ");
        System.out.print("страна производитель " + getProductionCountry() + ", ");
        System.out.print("скорость передвижения " + getMovementSpeed() + ". ");
        System.out.println();
    }
}

