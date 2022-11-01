package transport;

public class Bus extends Transport {

    public Bus(String brand, String model, int year, String country, int maxSpeed) {
        super(brand, model, year, country, maxSpeed);
    }

    @Override
    public void refill() {
        System.out.println("Заправка либо дизельным топливом, либо бензином");
    }

    @Override
    public String toString() {
        return "Автобус - " +
                getBrand() + "\n" +
                "Модель - " + getModel() + "\n" +
                "Год выпуска - " + getYear() + "\n" +
                "Страна производства - " + getCountry() + "\n" +
                "Скорость передвижения - " + getMaxSpeed() + "км/ч" + "\n";
    }
}
