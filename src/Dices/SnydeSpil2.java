package Dices;

public class SnydeSpil2 {

    public static void main()
    {
        FalskTerning2 t1 = new FalskTerning2("t1");
        t1.setSnydevaerdi(4);

        for (int i=0; i<20; i++)
        {
            t1.kast();
            System.out.println(t1.toString());
        }
    }
}
