package at.lus.basic.oop.Rechner;

public class TestIT_Calc{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();



        System.out.println("Addieren: " + calculator.add(5, 3));
        System.out.println("Subtrahieren: " + calculator.sub(5,3));
        System.out.println("Multiplizieren: " + calculator.mult(5,3));
        System.out.println("Dividieren: " +calculator.div(5,2));

        System.out.println("Sinus: " + Sciencecalc.sin(2));
        System.out.println("Cosinus: " + Sciencecalc.cos(3));

        System.out.println("Wurzel: " + Squarecalc.sqrt(4));

    }
}
