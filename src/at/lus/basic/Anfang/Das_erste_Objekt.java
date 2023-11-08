package at.lus.basic.Anfang;


public class Das_erste_Objekt {

    public static void main(String[] args){

        Car c1 = new Car();
        c1.marke = "Audi";
        c1.verbrauch = 7;
        c1.serie = "A1234";
        c1.farbe = "Schwarz";
        c1.fuel = 50;

        Car c2 = new Car();
        c2.marke = "Mercedes";
        c2.verbrauch = 5;
        c2.serie = "B1234";
        c2.farbe = "Grau";
        c2.fuel = 60;


        System.out.println(c2.fuel);
        c2.drive();
        c2.honk(2);
        c2.turboboost();
        c2.brea();
        c2.drive();
        c2.getRemainingRange();
        c2.brea();




    }

}
