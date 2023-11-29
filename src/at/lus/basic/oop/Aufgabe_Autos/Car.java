package at.lus.basic.oop.Aufgabe_Autos;


public class Car {

    private String sColor;
    private double dMaxgeschw;
    private double dPrice;
    private double dUsage;
    private Producer producer;
    private Engine engine;

    public Car(String sColor, double dMaxgeschw, double dPrice, double dUsage, Producer producer, Engine engine) {
        this.sColor = sColor;
        this.dMaxgeschw = dMaxgeschw;
        this.dPrice = dPrice;
        this.dUsage = dUsage;
        this.producer = producer;
        this.engine = engine;
    }

    public double calcPrice(){
        double dDiscount = producer.getDiscount();
        return dPrice - (dPrice * dDiscount);
    }

    public double calcUsage(int iDistanc){
        if(iDistanc <= 50000){
            return dUsage;
        }else{
            return dUsage * 1.098;
        }
    }

    public String getsColor() {
        return sColor;
    }

    public void setsColor(String sColor) {
        this.sColor = sColor;
    }

    public double getdMaxgeschw() {
        return dMaxgeschw;
    }

    public void setdMaxgeschw(double dMaxgeschw) {
        this.dMaxgeschw = dMaxgeschw;
    }

    public double getdPrice() {
        return dPrice;
    }

    public void setdPrice(double dPrice) {
        this.dPrice = dPrice;
    }

    public double getdUsage() {
        return dUsage;
    }

    public void setdUsage(double dUsage) {
        this.dUsage = dUsage;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}