public class Flower {
    public String getFlowerColorName() {
        return flowerColorName;
    }

    public void setFlowerColorName(String flowerColorName) {
        if (flowerColorName != null && !flowerColorName.isBlank() && !flowerColorName.isEmpty()) {
            this.flowerColorName = flowerColorName;
        } else {
            this.flowerColorName = "белый";
        }
    }

    //Цвет цветка (flowerColor);
    private String flowerColorName;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country != null && !country.isEmpty() && !country.isBlank()) {

            this.country = country;
        } else {
            this.country = "Россия";
        }
    }

    //Страна происхождения (country);
    private String country;

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        if (cost > 0) {
            this.cost = cost;
        } else {
            this.cost = 1.00f;
        }
    }

    //Стоимость (cost);
    private float cost;

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = Math.abs(lifeSpan);
        }

    }

    //Срок стояния, указанный в целых днях (lifeSpan).
    private int lifeSpan;

    Flower(String flowerColorName, String country, float cost, int lifeSpan) {

        this.flowerColorName = flowerColorName;

        if (flowerColorName != null && !flowerColorName.isBlank() && !flowerColorName.isEmpty()) {
            this.flowerColorName = flowerColorName;
        } else {
            this.flowerColorName = "белый";
        }


        this.country = country;
        if (country != null && !country.isEmpty() && !country.isBlank()) {

            this.country = country;
        } else {
            this.country = "Россия";
        }

        this.cost = cost;
        if (cost > 0) {
            this.cost = cost;
        } else {
            this.cost = 1.00f;
        }

        this.lifeSpan = lifeSpan;
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = Math.abs(lifeSpan);
        }

    }

    void printflower() {
        System.out.println("Название- " + flowerColorName + "," + " страной происхождения- " + country + "," + " стоимость- "
                + cost + ", " + "срок стояния цветка- " + lifeSpan);


    }
}