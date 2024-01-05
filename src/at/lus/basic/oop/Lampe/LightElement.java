package at.lus.basic.oop.Lampe;

public class LightElement {

    private String sName;
    private double sPower;
    private String sColor;
    private boolean bState;



    public LightElement(String sName, double sPower, String sColor, boolean dState) {
        this.sName = sName;
        this.sPower = sPower;
        this.sColor = sColor;
        this.bState = false;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public double getsPower() {
        return sPower;
    }

    public void setsPower(double sPower) {
        this.sPower = sPower;
    }

    public String getsColor() {
        return sColor;
    }

    public void setsColor(String sColor) {
        this.sColor = sColor;
    }


    public void turnOn() {
        System.out.println("Mein Name ist " + sName + ". Ich bin eingeschaltet.");
        bState = true;
    }

    public boolean isbState() {
        return bState;
    }

    public void setbState(boolean bState) {
        this.bState = bState;
    }
}
