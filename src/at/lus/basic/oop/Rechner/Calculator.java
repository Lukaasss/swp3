package at.lus.basic.oop.Rechner;

public class Calculator {

    public int add(int a, int b){
        return a + b;
    }

    public int sub(int a, int b){
        return a - b;
    }

    public double mult(double a, double b){
        return a * b;
    }

    public double div(double a, double b){
        if(b == 0){
            System.out.println("Error");
            return Double.NaN;
        }
        return (double) a / b;
    }
}