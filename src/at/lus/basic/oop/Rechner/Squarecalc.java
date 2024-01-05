package at.lus.basic.oop.Rechner;

public class Squarecalc extends Calculator{

    public static double sqrt(double number){
        if(number < 0){
            System.out.println("Error");
            return Double.NaN;
        }
        return Math.sqrt(number);
    }

}
