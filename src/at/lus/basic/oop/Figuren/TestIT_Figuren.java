package at.lus.basic.oop.Figuren;

public class TestIT_Figuren {

    public static void main(String[] args) {
        Kreis kreis1 = new Kreis("K1",2);
        Quadrat quadrat1 = new Quadrat("Q1", 4);
        Viereck viereck1 = new Viereck("V1", 3,5);
        Würfel würfel1 = new Würfel("W1", 3);

        kreis1.getArea(3);
        quadrat1.getArea(4);
        viereck1.getArea(3,5);
        würfel1.getArea(3);

    }
}