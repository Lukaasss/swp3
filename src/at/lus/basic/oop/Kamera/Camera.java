package at.lus.basic.oop.Kamera;

public class Camera {

    private int pixel;
    private int weight;
    private String color;
    private SDCard sdCard;
    private Lens lens;
    private Producer producer;

    public Camera(int pixel, int weight, String color, SDCard sdCard, Lens lens, Producer producer) {
        this.pixel = pixel;
        this.weight = weight;
        this.color = color;
        this.sdCard = sdCard;
        this.lens = lens;
        this.producer = producer;
    }


    public void takePic(String name, String date){
        if(sdCard.Taking() == true){
            File picture = new File(name,date,lens.fileSize());
            sdCard.AddFile(picture);
        }
    }

    public void changeSDCard(){
        SDCard freshSDCard = new SDCard(32,lens);
        sdCard = freshSDCard;
        sdCard.FreeSpace();
        System.out.println("SD-Karte wurden ausgewechselt ");
    }


    public int getPixel() {
        return pixel;
    }

    public void setPixel(int pixel) {
        this.pixel = pixel;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public SDCard getSdCard() {
        return sdCard;
    }

    public void setSdCard(SDCard sdCard) {
        this.sdCard = sdCard;
    }

    public Lens getLens() {
        return lens;
    }

    public void setLens(Lens lens) {
        this.lens = lens;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }
}
