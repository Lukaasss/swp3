package Lampe;

public class TestIT_Lampe {

    public static void main(String[] args) {

        Lampe lampe = new Lampe("WOW", 5);

        LightElement lightElement = new LightElement("WOW", 5, "Rot", true);

        System.out.println(lampe.getdAllPowerusage());


    }

}
