package Dices;

public class Terning {
    private int vaerdi;
    protected String navn;

    public Terning(){
    }

    public Terning(String navn){
      this.navn=navn;
    }

    public int getVaerdi() {
        return vaerdi;
    }

    public void setVaerdi(int vaerdi) {
        this.vaerdi = vaerdi;
    }


    public void kast(){
        int tal = (int) (6*Math.random() + 1);
        setVaerdi(tal); // sæt værdien på terningen
    }

   @Override
    public String toString() {
        String tekst;
        tekst=navn + ": "+vaerdi+"  ";
        return tekst;
    }
}
