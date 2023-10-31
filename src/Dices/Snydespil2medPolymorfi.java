package Dices;

public class Snydespil2medPolymorfi {
    public static void main()
    {
        FalskTerning2 ft = new FalskTerning2("ft");
        ft.setSnydevaerdi(4);

        Terning t;
        t = ft;
        // punkt A
        for (int i=0; i<3; i++)
        {
            t.kast();
            System.out.println(t.toString());
        }
    }
}
