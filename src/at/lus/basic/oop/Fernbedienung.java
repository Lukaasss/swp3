package at.lus.basic.oop;
import java.util.ArrayList;

public class Fernbedienung {
    private ArrayList<Batterien> batterien;

    public Fernbedienung() {
        this.batterien = new ArrayList<>();
        this.batterien.add(new Batterien());
        this.batterien.add(new Batterien());
    }

    public double getStatus() {
        double sumStatus = 0.0;
        for (Batterien batterie : batterien) {
            sumStatus += batterie.getStatus();
        }
        return sumStatus / batterien.size();
    }

    public void turnOn() {
        for (Batterien batterie : batterien) {
            batterie.verbraucherAngeschlossen();
            batterie.schwaeche(5);
        }
    }

    public void turnOff() {
        for (Batterien batterie : batterien) {
            batterie.keinVerbraucherAngeschlossen();
        }
    }

    public static void main(String[] args) {
        Fernbedienung fernbedienung = new Fernbedienung();

        // Beispiel für den Gebrauch der Fernbedienung
        fernbedienung.turnOn();
        System.out.println("Ladestatus nach Einschalten: " + fernbedienung.getStatus());

        fernbedienung.turnOff();
        System.out.println("Ladestatus nach Ausschalten: " + fernbedienung.getStatus());
    }
}