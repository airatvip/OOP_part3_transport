package transport;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class Car extends Transport {

    private double engineVolume;


    private String transmission;
    private String body;
    private String registrationNumber;
    private int numberOfSeats;
    private String tyres;
    private Key key;
    private Insurance insurance;

    @Override
    public void refill() {
        System.out.println("Можно заправлять бензином, дизелем на заправке или заряжать на специальных электропарковках, если это электрокар");
    }

    public static class Key {
        private String remoteEngineStart;
        private String keylessAccess;

        public Key(String remoteEngineStart, String keylessAccess) {
            if (remoteEngineStart == null || remoteEngineStart.isEmpty() || remoteEngineStart.isBlank()) {
                this.remoteEngineStart = "Нет информации";
            } else this.remoteEngineStart = remoteEngineStart;
            if (keylessAccess == null || keylessAccess.isEmpty() || keylessAccess.isBlank()) {
                this.keylessAccess = "Нет информации";
            } else this.keylessAccess = keylessAccess;
        }

        public String getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public String getKeylessAccess() {
            return keylessAccess;
        }

        @Override
        public String toString() {
            return "Удаленный запуск двигателя - " + remoteEngineStart + '\n' +
                    "Бесключевой доступ - " + keylessAccess + '\n';
        }
    }

    public static class Insurance {

        private String validityPeriodInsurance;

        private final double costInsurance;

        private final String numberInsurance;

        public Insurance(String validityPeriodInsurance, double costInsurance, String numberInsurance) {
            if (validityPeriodInsurance == null || validityPeriodInsurance.isEmpty() || validityPeriodInsurance.isBlank()) {
                this.validityPeriodInsurance = "Нет информации";
            } else if (validityPeriodInsurance.matches("\\d{2}[.]\\d{2}[.]\\d{4}")) {
                this.validityPeriodInsurance = validityPeriodInsurance;
            } else this.validityPeriodInsurance = "Некорретный номер";

            if (costInsurance <= 0) {
                this.costInsurance = 0;
            } else this.costInsurance = costInsurance;


            if (numberInsurance == null || numberInsurance.isEmpty() || numberInsurance.isBlank()) {
                this.numberInsurance = "Нет информации";
            } else this.numberInsurance = numberInsurance;
        }

        public String getValidityPeriodInsurance() {
            return validityPeriodInsurance;
        }

        public double getCostInsurance() {
            return costInsurance;
        }

        public String getNumberInsurance() {
            return numberInsurance;
        }

        @Override
        public String toString() {
            return "ОСАГО: " + "\n" +
                    "Срок действия - " + validityPeriodInsurance + "\n" +
                    "Цена - " + costInsurance + "\n" +
                    "Номер полиса ОСАГО - " + numberInsurance + "\n";
        }

        public void checkingTheExpirationDate() {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate date = LocalDate.parse(validityPeriodInsurance, formatter);
//                LocalDate date2 = LocalDate.now();
//                System.out.println(date);
//                System.out.println(LocalDate.now());
            if (date.isBefore(LocalDate.now())) {
                System.out.println("Нужно оформить новую страховку");
            }
        }

        public void checkingTheNumber() {
//            if (numberInsurance.matches(".{9}")) {
            if (getNumberInsurance().length() == 8) {
            } else System.out.println("Номер страховки некорректный");
        }
    }

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String body, String registrationNumber, int numberOfSeats, String tyres, int maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);


        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else this.engineVolume = engineVolume;

        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "Нет информации";
        } else this.transmission = transmission;

        if (body == null || body.isEmpty() || body.isBlank()) {
            this.body = "Нет информации";
        } else this.body = body;

        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            this.registrationNumber = "Нет информации";
        }
        if (registrationNumber.matches("[АВЕКМНОРСТУХ]\\d{2}[1-9][АВЕКМНОРСТУХ]{2}\\d{3}")) {
            this.registrationNumber = registrationNumber;
        } else this.registrationNumber = "Некорретный номер";


        if (numberOfSeats <= 0) {
            this.numberOfSeats = 0;
        } else this.numberOfSeats = numberOfSeats;

        if (!tyres.equals("Зима") && !tyres.equals("Лето")) {
            this.tyres = "Нет информации";
        } else this.tyres = tyres;
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + "\n" +
                "Год выпуска - " + getYear() + "\n" +
                "Сборка - " + getCountry() + "\n" +
                "Цвет кузова - " + getColor() + "\n" +
                "Объем двигателя - " + engineVolume + "\n" +
                "Коробка передач - " + transmission + "\n" +
                "Кузов: " + body + "\n" +
                "Регистрационный номер: " + registrationNumber + "\n" +
                "Количество сидячих мест - " + numberOfSeats + "\n" +
                "Сезонность шин - " + tyres + "\n" +
                "Максимальная скорость - " + getMaxSpeed() + "\n" +
                key + "\n" +
                insurance + "\n";


    }


    public double getEngineVolume() {
        return engineVolume;
    }


    public String getTransmission() {
        return transmission;
    }

    public String getBody() {
        return body;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getTyres() {
        return tyres;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }


    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setTyres(String tyres) {
        this.tyres = tyres;
    }


    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;

    }

    public void tyreService() {

        Date date1 = new Date(LocalDate.now().getYear(), 2, 1);
        Date date2 = new Date(LocalDate.now().getYear(), 9, 31);
        Date date3 = new Date(LocalDate.now().getYear() + 1, 2, 1);
//        Date today = new Date(LocalDate.now().getYear(), LocalDate.now().getMonthValue() - 1, LocalDate.now().getDayOfMonth());
        Date today = new Date(2022, 05, 10);
//        System.out.println(today);
//        System.out.println(date2);
//        System.out.println(date1);
        if (tyres.equals("Зима") && today.after(date1) && today.before(date2)) {
            System.out.println(getBrand() + " " + getModel() + " " + "Сменить шины на летние");
        }
        if (tyres.equals("Лето") && today.after(date2) && today.before(date3)) {
            System.out.println(getBrand() + " " + getModel() + " " + "Сменить шины на зимние");
        }
        if (tyres.equals("Нет информации")) {
            System.out.println(getBrand() + " " + getModel() + " " + "Уточнить информацию");
        }


    }
}
