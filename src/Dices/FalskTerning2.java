package Dices;


public class FalskTerning2 extends Terning
{
    private int snydevaerdi;

    public FalskTerning2() {
    }

    public FalskTerning2(String navn) {
        super(navn);
    }

    public void setSnydevaerdi(int nySnydevaerdi)
    {
        snydevaerdi = nySnydevaerdi;
    }

    public void kast()
    {
        int vaerdi = (int) (6*Math.random() + 1);

        // 1 eller 2? Så lav det om til snydeværdi!
        if ( vaerdi <= 2 )
            vaerdi = snydevaerdi;

        setVaerdi(vaerdi); // sæt værdien på terningen
    }
}
