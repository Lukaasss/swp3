package at.lus.basic.oop.Figuren;

public class Kreis {

    private String name;
    private double radius;


    public Kreis(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    public void getArea(double radius){
        double area = 2 * radius * 3.14159;
        System.out.println("Flächeninhalt: " + area);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
