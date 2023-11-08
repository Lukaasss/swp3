package at.lus.basic.Anfang;

public class Car {

    public double verbrauch;
    public double fuel;
    public String marke;
    public String serie;
    public String farbe;



    public void drive (){
        this.fuel = this.fuel - verbrauch;
        System.out.println("Am fahre");
    }

    public void brea() {

        System.out.println("I brems");
    }

    public void turboboost(){

        double vergleich = 0;

        vergleich = this.fuel/100;
        if (vergleich < 0.1){
            System.out.println("Not enough fuel");
        }
        else{
            System.out.println("Turbo Boost activated");
        }
    }

    public void honk(int amountOfRepetitions){

        for (int i = 0; i < amountOfRepetitions; i++) {

            System.out.println("Tuuuuuuuuut");
        }
    }

    public void getRemainingRange(){

        double rest = 0;

        rest = this.fuel/ verbrauch;

        System.out.println("Sie können noch " + rest + " mal fahren");
    }
}

