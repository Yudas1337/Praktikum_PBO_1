/**
 * Coded By Yudas Malabi
 *
 * 
 */

/**
 * Create Laptop Class.
 *
 * @return void
 */
public class Laptop {
    private Boolean isPortable, isOpenApps;
    private String merk, color, type;
    private float screenSize;

    public Boolean setIsPortable(Boolean isPortable) {
        return this.isPortable = isPortable;

    }

    public float screenSize(float screenSize) {
        return this.screenSize = screenSize;
    }

    public Boolean setIsOpenApps(Boolean isOpenApps) {
        return this.isOpenApps = isOpenApps;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void type(String type) {
        this.type = type;
    }

    public void print() {
        System.out.println("Portable: " + (this.isPortable ? "Ya" : "Tidak"));
        System.out.println("Status: " + (this.isOpenApps ? "Sedang membuka software" : "software sudah ditutup"));
        System.out.println("Merk: " + this.merk);
        System.out.println("Ukuran Layar: " + this.screenSize);
        System.out.println("Warna: " + this.color);
        System.out.println("Type:" + this.type);
    }

}
