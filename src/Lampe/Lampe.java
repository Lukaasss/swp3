package Lampe;

import java.util.ArrayList;
import java.util.List;

public class Lampe {

    private ArrayList<LightElement> lightElements;
    private double dAllPowerusage;
    private String sName;


    public Lampe(String sName, double dAllPowerusage) {
        this.lightElements = new ArrayList<>();
        this.dAllPowerusage = dAllPowerusage;
        this.sName = sName;
    }

    public List<LightElement> getLightElements() {
        return lightElements;
    }

    public void setLightElements() {
        this.lightElements = lightElements;
    }

    public double getdAllPowerusage() {
        return dAllPowerusage;
    }

    public void setdAllPowerusage(double dAllPowerusage) {
        this.dAllPowerusage = dAllPowerusage;
    }


    public void turnAllOn(){
        for(LightElement lightElement : lightElements){
            if(lightElement.isbState()){
                lightElement.turnOn();
            }else{
                System.out.println("Mein Name ist " + lightElement.getsName() + ". Ich bin bereits eingeschaltet.");
            }
        }
    }

    public void nameLightElements(){
        for(LightElement lightElements : lightElements){
            System.out.println(lightElements.getsName());
        }
    }
}
