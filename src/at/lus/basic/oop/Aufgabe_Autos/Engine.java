package at.lus.basic.oop.Aufgabe_Autos;

public class Engine {


    private String sFuel;
    private int iPower;

    public Engine(String sFuel, int iPower) {
        this.sFuel = sFuel;
        this.iPower = iPower;
    }

    public String getsFuel() {
        return sFuel;
    }

    public void setsFuel(String sFuel) {
        this.sFuel = sFuel;
    }

    public int getiPower() {
        return iPower;
    }

    public void setiPower(int iPower) {
        this.iPower = iPower;
    }
}
