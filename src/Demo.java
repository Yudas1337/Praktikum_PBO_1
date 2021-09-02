/**
 * Coded By Yudas Malabi
 *
 * 
 */

/**
 * Create Demo class for main method.
 *
 * @return void
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        Laptop obj1 = new Laptop();
        Smartphone obj2 = new Smartphone();
        Accoustic obj3 = new Accoustic();
        Electric obj4 = new Electric();
        Guitar obj5 = new Guitar();

        /**
         * Laptop Object
         */
        System.out.println("=========================================");
        System.out.println("Laptop");
        obj1.screenSize(15.6f);
        obj1.setIsOpenApps(true);
        obj1.setMerk("Asus Republic Of Gamers G531GT");
        obj1.setColor("Black");
        obj1.type("Laptop Gaming");
        obj1.print();
        System.out.println("=========================================");

        /**
         * Smartphone Object
         */
        System.out.println("=========================================");
        System.out.println("Smartphone");
        obj2.setVolumeUp(80);
        obj2.setVolumeDown(20);
        obj2.setMerk("Asus Republic Of Gamers Phone 3");
        obj2.setColor("Black");
        obj2.setType("Smartphone Gaming");
        obj2.print();
        System.out.println("=========================================");

        /**
         * Accoustic Object
         */
        System.out.println("=========================================");
        System.out.println("Accoustic");
        obj3.setType("Accoustic Guitar");
        obj3.setEffect("Clean");
        obj3.setMaterial("Rosewood");
        obj3.setFret(17);
        obj3.setStrings("Nylon");
        obj3.setChord('A');
        obj3.print();
        System.out.println("=========================================");
        /**
         * Electric Object
         */
        System.out.println("=========================================");
        System.out.println("Electric");
        obj4.setType("Electric Guitar");
        obj4.setEffect("Fuzz, Distortion, Overdrive, Delay, Reverb");
        obj4.setMaterial("Mahogany");
        obj4.setFret(24);
        obj4.setStrings("String");
        obj4.setChord('E');
        obj4.print();
        System.out.println("=========================================");
        /**
         * Guitar Object
         */
        System.out.println("=========================================");
        System.out.println("Guitar");
        obj5.setFret(17);
        obj5.setStrings("Nylon");
        obj5.setChord('C');
        obj5.print();
        System.out.println("=========================================");

    }
}
