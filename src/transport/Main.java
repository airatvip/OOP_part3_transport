package transport;

public class Main {
    public static void main(String[] args) {

        Car lada = new Car("LADA", "Granta", 1.7, "желтый", 2015, "Россия", "МКПП", "Лифтбек", "А552ЮН102", 5, "Зима", 180);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия", "АКПП", "Седан", "К152СН152", 5, "Лето",200);
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия", "АКПП", "Купе", "С248КН716", 2, "Лето",225);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.0, "красный", 2018, "Южная Корея", "МКПП", "Универсал", "А523МН716", 5, "Лето",200);
        Car hyundai = new Car("Hyundai", "Avante", 2.4, "оранжевый", 2016, "Южная Корея", "МКПП", "Седан", "В526ВН102", 5, "Лето",185);
//        System.out.println(lada);
//        System.out.println(audi.toString());
//        System.out.println(bmw.toString());
//        System.out.println(kia.toString());
//        System.out.println(hyundai.toString());


        Car.Key key1 = new Car.Key("Нет", "Нет");
        lada.setKey(key1);
//        System.out.println(lada);
        Car.Key key2 = new Car.Key("Да", "Да");
        audi.setKey(key2);
//        System.out.println(audi);
        Car.Key key3 = new Car.Key("Нет", "Да");
        bmw.setKey(key3);
//        System.out.println(bmw);
        Car.Key key4 = new Car.Key("Да", "Нет");
        kia.setKey(key4);
//        System.out.println(kia);
        Car.Key keyUnknown = new Car.Key("", "");
        hyundai.setKey(keyUnknown);
//        System.out.println(hyundai);

        Car.Insurance ladaIns = lada.new Insurance("21.09.2022", 5002.25, "МММ256321" );
        lada.setInsurance(ladaIns);
        System.out.println(lada);
        Car.Insurance audiIns = audi.new Insurance("21.12.2022", 15035.25, "МCC256352" );
        audi.setInsurance(audiIns);
        System.out.println(audi);
        Car.Insurance bmwIns = bmw.new Insurance("15.05.2022", 15112.72, "МXX234444" );
        bmw.setInsurance(bmwIns);
        System.out.println(bmw);
        Car.Insurance kiaIns = kia.new Insurance("01.06.2022", 15102.50, "АВВ223546" );
        kia.setInsurance(kiaIns);
        System.out.println(kia);
        Car.Insurance hyundaiIns = hyundai.new Insurance("03.12.2022", 7856.25, "ВВВ256" );
        hyundai.setInsurance(hyundaiIns);
        System.out.println(hyundai);
//        hyundaiIns.checkingTheNumber();
//        hyundaiIns.checkingTheExpirationDate();
//        bmwIns.checkingTheExpirationDate();
//        lada.tyreService();
//        audi.tyreService();
        Train lastochka = new Train(3500,0,"Белорусский вокзал", "Минск - Пассажирский",11, "\"Ласточка\"","B-901",2011, "Россия", 301);
        Train leningrad = new Train(1700, 0, "Ленинградский вокзал", "Ленинград - Пассажирский", 8,"\"Ленинград\"", "",2019,"Россия",270);

        System.out.println(lastochka);
        System.out.println(leningrad);

        Bus liaz = new Bus("ЛИАЗ","5293.00", 2013, "Россия", 90 );
        Bus paz = new Bus("ПАЗ", "3205", 1989, "Россия", 92);
        Bus nefaz = new Bus("НефАЗ", "5299", 2000, "Россия", 103);
        System.out.println(liaz);
        System.out.println(paz);
        System.out.println(nefaz);
        audi.refill();
        lastochka.refill();
        liaz.refill();


    }



}
