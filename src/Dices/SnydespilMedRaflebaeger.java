package Dices;

public class SnydespilMedRaflebaeger {
    public static void main() {
        Terning t1 = new Terning("t1");
        FalskTerning1 t2 = new FalskTerning1("t2");
        Raflebaeger rf = new Raflebaeger();
        rf.tilfoej(t1);
        rf.tilfoej(t2);
        rf.ryst();
        rf.udskrivindhold();
    }
}
