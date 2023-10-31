package Dices;

public class FalskTerning1 extends Terning
{
    public FalskTerning1(String navn){
        this.navn=navn;
    }

    /** tilsidesæt/overskriv kast  */
    @Override
    public void kast()
    {
        int vaerdi = (int) (6*Math.random() + 1);
        // er det 1 eller 2? Så lav det om til 6!
        if ( vaerdi <= 2 )
            vaerdi = 6;
        setVaerdi(vaerdi); // sæt værdien på terningen
    }
}
