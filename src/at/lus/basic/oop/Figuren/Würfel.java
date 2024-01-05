package at.lus.basic.oop.Figuren;

public class Würfel extends Quadrat{


    public Würfel(String name, int seiteA) {
        super(name, seiteA);
    }

    public void getArea(int seiteA){
        int area = seiteA * seiteA * 6;
        System.out.println("Flächeninhalt: " + area);
    }
}
