package at.lus.basic.oop.Fernbedienung;

public class TestIt_Fernbedienung {
        public static void main(String[] args) {
            Fernbedienung fernbedienung = new Fernbedienung();

            System.out.println("Ladestatus vor Einschalten: " + fernbedienung.getStatus());
            fernbedienung.turnOn();
            System.out.println("Ladestatus nach Einschalten: " + fernbedienung.getStatus());

            fernbedienung.turnOff();
            System.out.println("Ladestatus nach Ausschalten: " + fernbedienung.getStatus());

            fernbedienung.turnOn();
            System.out.println("Ladestatus nach Einschalten: " + fernbedienung.getStatus());

            fernbedienung.turnOff();
            System.out.println("Ladestatus nach Ausschalten: " + fernbedienung.getStatus());

        }
    }
