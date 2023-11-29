package at.lus.basic.oop.Klasse_Bsp;

public class TestIT_Auto {

    public static void main(String[] args) {

        Auto auto = new Auto(300,"rot");
        Auto auto1 = new Auto();

        auto.setsFarbe("rot");
        auto.setiLeistung(300);
        //auto.iLeistung = 400;
        System.out.println(auto.getiLeistung());
        System.out.println(auto.getsFarbe());

        Fahrrad fahrrad = new Fahrrad();

        auto.setKofferraumfahrrad(fahrrad);

        System.out.println(fahrrad.getiRahmengroese() + " " +fahrrad.getsFarbe());
        System.out.println(fahrrad.getsFarbe());
        System.out.println(fahrrad.getiRahmengroese());


        Flasche flasche = new Flasche("Vo Üs",1, "Cola");

        Getraenkekiste getraenkekiste = new Getraenkekiste(24,flasche);

        auto.setKofferaumgetraenke(getraenkekiste);

        System.out.println(auto.getKofferraumfahrrad().getsFarbe());






    }

}
