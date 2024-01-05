package at.lus.basic.oop.Kamera;

public class Lens {

    private int pixel;
    private int size;



    public Lens(int pixel) {
        this.pixel = pixel;
    }

    public int fileSize(){
        if(pixel == 2000){
            size = 2;
        }else if(pixel == 4000){
            size = 4;
        }else if( pixel == 6000){
            size = 6;
        }
        return size;
    }

    public int getPixel() {
        return pixel;
    }

    public void setPixel(int pixel) {
        this.pixel = pixel;
    }

}
