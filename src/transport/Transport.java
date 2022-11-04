package transport;

public abstract class  Transport {
    private String brand;
    private String model;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, int year, String country, int maxSpeed) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";
        } else this.brand = brand;


        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        } else this.model = model;

        if (year <= 0) {
            this.year = 2000;
        } else this.year = year;

        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "default";
        } else this.country = country;

        if (maxSpeed <= 0) {
            this.maxSpeed = Math.abs(maxSpeed);
        } else this.maxSpeed = maxSpeed;
    }

    public Transport (String brand, String model, int year, String country, String color, int maxSpeed) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";
        } else this.brand = brand;

        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        } else this.model = model;

        if (year <= 0) {
            this.year = 2000;
        } else this.year = year;

        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "default";
        } else this.country = country;

        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "белый";
        } else this.color = color;

        if (maxSpeed <= 0) {
            this.maxSpeed = Math.abs(maxSpeed);
        } else this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public abstract void refill ();





}
