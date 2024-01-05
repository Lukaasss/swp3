package at.lus.basic.oop.Figuren;

public class Viereck extends Quadrat{
    private int seiteB;
    public Viereck(String name, int seiteA, int seiteB) {
        super(name, seiteA);
        this.seiteB = seiteB;
    }
    public void getArea(int seiteA, int seiteB){
        int area = seiteA * seiteB;
        System.out.println("Flächeninhalt: " + area);
    }
    public int getSeiteB() {
        return seiteB;
    }
    public void setSeiteB(int seiteB) {
        this.seiteB = seiteB;
    }
}