package at.lus.basic.oop.Kamera;

public class TestIT_Kamera {

    public static void main(String[] args) {
        Producer producer = new Producer("Canon", "Germany");
        File file = new File("file-3102", "01/01/2024", 6);
        Lens lens = new Lens(6000);
        SDCard sdCard = new SDCard(16, lens);
        sdCard.AddFile(file);
        Camera camera = new Camera(6, 200, "Orange", sdCard, lens, producer);

        camera.takePic("picture-00000000000001", "01/01/2024");
        camera.takePic("picture-00000000000002", "01/01/2024");
        camera.changeSDCard();
        camera.takePic("picture-00000000000003", "01/01/2024");
        camera.takePic("picture-00000000000004", "01/01/2024");
        camera.takePic("picture-00000000000005", "01/01/2024");






    }
}