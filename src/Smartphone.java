/**
 * Coded By Yudas Malabi
 *
 * 
 */

/**
 * Create Smartphone Class.
 *
 * @return void
 */
public class Smartphone {

    private int volume;
    private String merk, color, type;

    public int setVolumeUp(int volume) {
        return this.volume += volume;
    }

    public int setVolumeDown(int volume) {
        return this.volume -= volume;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void print() {
        System.out.println("Merk:" + this.merk);
        System.out.println("Warna:" + this.color);
        System.out.println("Volume Hp:" + this.volume);
        System.out.println("Type: " + this.type);
    }

}
