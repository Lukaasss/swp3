package at.lus.basic.oop.Klasse_Bsp;

public class Flasche {

    private String sHersteller;
    private int iVolumen;
    private String sGefuelltmit;

    public Flasche(String sHersteller, int iVolumen, String sGefuelltmit) {
        this.sHersteller = sHersteller;
        this.iVolumen = iVolumen;
        this.sGefuelltmit = sGefuelltmit;
    }

    public String getsHersteller() {
        return sHersteller;
    }

    public void setsHersteller(String sHersteller) {
        this.sHersteller = sHersteller;
    }

    public int getiVolumen() {
        return iVolumen;
    }

    public void setiVolumen(int iVolumen) {
        this.iVolumen = iVolumen;
    }

    public String getsGefuelltmit() {
        return sGefuelltmit;
    }

    public void setsGefuelltmit(String sGefuelltmit) {
        this.sGefuelltmit = sGefuelltmit;
    }
}
