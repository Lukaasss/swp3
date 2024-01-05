package at.lus.basic.oop.Lampe;

import java.util.ArrayList;

public class TestIT_Lampe {

    public static void main(String[] args) {

        Lampe lampe = new Lampe("WOW", 5);

        LightElement lightElement = new LightElement("WOW", 5, "Rot", true);

        LightElement lightElement1 = new LightElement("WO", 6, "Blau", true);

        ArrayList<LightElement> elementArrayList = new ArrayList<>();
        elementArrayList.add(lightElement);
        elementArrayList.add(lightElement1);

        System.out.println(lampe.getdAllPowerusage());
        System.out.println(lampe.getLightElements());
        lampe.turnAllOn();



    }

}
