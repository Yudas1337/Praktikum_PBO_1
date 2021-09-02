/**
 * Coded By Yudas Malabi
 *
 * 
 */

/**
 * Create Electric Class that inherit from Guitar.
 *
 * @return void
 */
public class Electric extends Guitar {
    private String type, effect, material;

    public void setType(String type) {
        this.type = type;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void print() {
        super.print();
        System.out.println("Type : " + this.type);
        System.out.println("Effect: " + this.effect);
        System.out.println("Material:" + this.material);
    }
}
