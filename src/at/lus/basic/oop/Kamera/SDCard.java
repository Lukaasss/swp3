package at.lus.basic.oop.Kamera;

import java.util.ArrayList;
import java.util.List;

public class SDCard {

    private int capacity;
    private List<File> files;
    private Lens lens;


    public SDCard(int capacity, Lens lens) {
        this.capacity = capacity;
        this.files = new ArrayList<>();
        this.lens = lens;
    }

    public int FreeSpace() {
        for (File file : this.files) {
            int a = 0;
            a += file.getSize();
        }
        int freeSp = this.capacity;
        return freeSp;
    }

    public boolean Taking() {
        boolean canSave;
        if (FreeSpace() < lens.fileSize()) {
            System.out.println("Nicht genug Speicherplatz vorhanden ");
            canSave = false;
        } else if (FreeSpace() > 10) {
            System.out.println("Genug Speicherplatz vorhanden ");
            canSave = true;
        } else {
            System.out.println("Speicherplatz gering, SD-Karten wechsel empfehlbar ");
            canSave = true;
        }
        return canSave;

    }

    public void AddFile(File file) {
        this.files.add(file);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }
}
