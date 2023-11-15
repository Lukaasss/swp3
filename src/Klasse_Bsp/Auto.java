package Klasse_Bsp;

import java.util.ArrayList;

public class Auto {

    private int iLeistung = 0;
    private String sFarbe = "keine Farbe";

    private Fahrrad kofferraumfahrrad;
    private ArrayList<Getraenkekiste> kofferaumgetraenke = new ArrayList<Getraenkekiste>();

    public Auto() {
    }

    public Auto(int iLeistung, String sFarbe) {
        this.iLeistung = iLeistung;
        this.sFarbe = sFarbe;
    }

    public int getiLeistung() {
        return iLeistung;
    }

    public void setiLeistung(int iLeistung) {
        this.iLeistung = iLeistung;
    }

    public String getsFarbe() {
        return sFarbe;
    }

    public void setsFarbe(String sFarbe) {
        this.sFarbe = sFarbe;
    }

    public Fahrrad getKofferraumfahrrad() {
        return kofferraumfahrrad;
    }

    public void setKofferraumfahrrad(Fahrrad kofferraumfahrrad) {
        this.kofferraumfahrrad = kofferraumfahrrad;
    }

    public ArrayList<Getraenkekiste> getKofferaumgetraenke() {
        return kofferaumgetraenke;
    }

    public void setKofferaumgetraenke(Getraenkekiste kofferaumgetraenke) {
        this.kofferaumgetraenke.add(kofferaumgetraenke);
    }
}
