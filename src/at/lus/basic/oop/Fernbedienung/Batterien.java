package at.lus.basic.oop.Fernbedienung;

public class Batterien {
    private double ladestatus;

    public Batterien() {
        this.ladestatus = 100.0;
    }

    public double getStatus() {
        return ladestatus;
    }

    public void verbraucherAngeschlossen() {
        System.out.println("Verbraucher angeschlossen");
    }

    public void keinVerbraucherAngeschlossen() {
        System.out.println("Kein Verbraucher angeschlossen");
    }

    public void schwaeche(int prozent) {
        ladestatus -= prozent;
    }
}