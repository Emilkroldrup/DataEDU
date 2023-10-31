package Dices;

import java.util.ArrayList;

public class Snydespil2medPolymorfi1 {

    public static void main()
    {
        Terning ter1 = new Terning("ter1");
        FalskTerning1 fter1 = new FalskTerning1("fter1");
        FalskTerning1 fter12 = new FalskTerning1("fter12");
        FalskTerning2 fter2 = new FalskTerning2("fter2");
        fter2.setSnydevaerdi(6);

        ArrayList<Terning> arrlist = new ArrayList<Terning>();
        arrlist.add(ter1);
        arrlist.add(fter1);
        arrlist.add(fter12);
        arrlist.add(fter2);

        for (Terning t : arrlist) {
            t.kast();
            System.out.println(t.toString());
        }
    }
}
