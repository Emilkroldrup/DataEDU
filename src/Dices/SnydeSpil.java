package Dices;

public class SnydeSpil {
    public static void main()
    {
        Terning t1 = new Terning("t1");
        FalskTerning1 t2 = new FalskTerning1("t2");

        System.out.println(t1.toString());
        System.out.println(t2.toString());

        for (int i=0; i<5; i++)
        {
            t1.kast();
            t2.kast();
            System.out.print(t1.toString());
            System.out.println(t2.toString());
            if (t1.getVaerdi() == t2.getVaerdi())
                System.out.println("To ens!");
        }
    }
}
