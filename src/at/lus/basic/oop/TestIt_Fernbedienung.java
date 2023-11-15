package at.lus.basic.oop;

public class TestIt_Fernbedienung {
        public static void main(String[] args) {
            Fernbedienung fernbedienung = new Fernbedienung();

            // Beispiel für den Gebrauch der Fernbedienung
            fernbedienung.turnOn();
            System.out.println("Ladestatus nach Einschalten: " + fernbedienung.getStatus());

            fernbedienung.turnOff();
            System.out.println("Ladestatus nach Ausschalten: " + fernbedienung.getStatus());
        }
    }
