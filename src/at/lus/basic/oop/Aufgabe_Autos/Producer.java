package at.lus.basic.oop.Aufgabe_Autos;

import at.lus.basic.oop.Klasse_Bsp.Getraenkekiste;

import java.util.ArrayList;

public class Producer {

    private String sName;
    private String sOrigin;
    private double dDiscount;

    private ArrayList<Car> aCars;

    public Producer(String sName, String sOrigin, double dDiscount) {
        this.sName = sName;
        this.sOrigin = sOrigin;
        this.dDiscount = dDiscount;
        this.aCars = new ArrayList<>();
    }

    public void addcar (Car car){
        this.aCars.add(car);
    }
    public double getDiscount() {
        return dDiscount;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsOrigin() {
        return sOrigin;
    }

    public void setsOrigin(String sOrigin) {
        this.sOrigin = sOrigin;
    }

    public double getdDiscount() {
        return dDiscount;
    }

    public void setdDiscount(double dDiscount) {
        this.dDiscount = dDiscount;
    }

    public ArrayList<Car> getaCars() {
        return aCars;
    }

    public void setaCars(ArrayList<Car> aCars) {
        this.aCars = aCars;
    }
}
