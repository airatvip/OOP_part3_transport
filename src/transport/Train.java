package transport;

public class Train extends Transport {

    private int priceOfTheTrip;
    private int travelTime;
    private String startStationName;
    private String stopStationName;
    private int quantityOfWagons;

    public Train(int priceOfTheTrip, int travelTime, String startStationName, String stopStationName, int quantityOfWagons, String brand, String model, int year, String country, int maxSpeed) {
        super(brand, model, year, country, maxSpeed);
        this.priceOfTheTrip = priceOfTheTrip;
        this.travelTime = travelTime;
        this.startStationName = startStationName;
        this.stopStationName = stopStationName;
        this.quantityOfWagons = quantityOfWagons;
    }

    public int getPriceOfTheTrip() {
        return priceOfTheTrip;
    }

    public void setPriceOfTheTrip(int priceOfTheTrip) {
        this.priceOfTheTrip = priceOfTheTrip;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }

    public String getStartStationName() {
        return startStationName;
    }

    public void setStartStationName(String startStationName) {
        this.startStationName = startStationName;
    }

    public String getStopStationName() {
        return stopStationName;
    }

    public void setStopStationName(String stopStationName) {
        this.stopStationName = stopStationName;
    }

    public int getQuantityOfWagons() {
        return quantityOfWagons;
    }

    public void setQuantityOfWagons(int quantityOfWagons) {
        this.quantityOfWagons = quantityOfWagons;
    }

    @Override
    public String toString() {
        return "Поезд - " +
                getBrand() + "\n" +
                "Модель - " + getModel() + "\n" +
                "Год выпуска - " + getYear() + "\n" +
                "Страна производства - " + getCountry() + "\n" +
                "Скорость передвижения - " + getMaxSpeed() + "км/ч" + "\n" +
                "Станция отправления - " + getStartStationName() + "\n" +
                "Станция прибытия - " + getStopStationName() + "\n" +
                "Цена поездки - " + getPriceOfTheTrip() + "\n" +
                "Время поездки - " + getTravelTime() + "\n" +
                "Количество вагонов - " + getQuantityOfWagons() + "\n";
    }

    @Override
    public void refill() {
        System.out.println( "Заправка дизельным топливом");
    }
}
