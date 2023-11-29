package at.lus.basic.oop.Aufgabe_Autos;

import java.util.ArrayList;

public class TestIt_Car {

    public static void main(String[] args) {

        Producer producer = new Producer("Honda", "Japan", 0.2);

        Engine engine = new Engine("Diesel", 300);

        Car car = new Car("Blau", 400, 25000,5,producer,engine);



        System.out.println("Auto Informationen");
        System.out.println("Preis " + car.calcPrice());
        System.out.println("Maximale Geschwindigkeit " + car.getdMaxgeschw());
        System.out.println("Verbrauch " + car.getdUsage());
        System.out.println("Treibstoff " + engine.getsFuel());
        System.out.println("Leistung " + engine.getiPower());
        System.out.println("Produzent " + producer.getsName());
        System.out.println("Herkunft " + producer.getsOrigin());
        System.out.println("Rabatt " + producer.getdDiscount());
        System.out.println("Berechneter Verbrauch nach 70000km --- " + car.calcUsage(70000) + "L/100km");

    }

}
