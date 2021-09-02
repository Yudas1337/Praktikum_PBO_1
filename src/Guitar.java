/**
 * Coded By Yudas Malabi
 *
 * 
 */

/**
 * Create Guitar Class.
 *
 * @return void
 */

public class Guitar {

    private int fret;
    private char chord;
    private String strings;

    public int setFret(int fret) {
        return this.fret = fret;
    }

    public void setStrings(String strings) {
        this.strings = strings;
    }

    public char setChord(char chord) {
        return this.chord = chord;
    }

    public void print() {
        System.out.println("Fret: " + this.fret);
        System.out.println("Strings: " + this.strings);
        System.out.println("Bunyi nada berada pada chord: " + this.chord);
    }

}
