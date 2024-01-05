package at.lus.basic.oop.Figuren;

public class Quadrat {

    private int seiteA;
    private String name;

    public Quadrat(String name, int seiteA) {
        this.seiteA = seiteA;
        this.name = name;
    }

    public void getArea(int seiteA){
        int area = seiteA * seiteA;
        System.out.println("Flächeninhalt: " + area);
    }


    public int getSeiteA() {
        return seiteA;
    }

    public void setSeiteA(int seiteA) {
        this.seiteA = seiteA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}