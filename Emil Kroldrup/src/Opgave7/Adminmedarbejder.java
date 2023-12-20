package Opgave7;

public class Adminmedarbejder extends Ansat {
    private Uddannelse uddannelse;
    private int ansaettelsesgrad;
    private double timeloen;

    public Uddannelse getUddannelse() {
        return uddannelse;
    }

    public void setUddannelse(Uddannelse uddannelse) {
        this.uddannelse = uddannelse;
    }

    public int getAnsaettelsesgrad() {
        return ansaettelsesgrad;
    }

    public void setAnsaettelsesgrad(int ansaettelsesgrad) {
        this.ansaettelsesgrad = ansaettelsesgrad;
    }

    public double getTimeloen() {
        return timeloen;
    }

    public void setTimeloen(double timeloen) {
        this.timeloen = timeloen;
    }

    public enum Uddannelse {
        BOGHOLDER, SEKRETAER
    }


    public Adminmedarbejder(String medarbejderNr, String fnavn, String enavn, String adresse, String ansaettelsesdato, int afdelingsNummer, Uddannelse uddannelse, int ansaettelsesgrad, double timeloen) {
        super(medarbejderNr, fnavn, enavn, adresse, ansaettelsesdato, afdelingsNummer);
        this.uddannelse = uddannelse;
        this.ansaettelsesgrad = ansaettelsesgrad;
        this.timeloen = timeloen;
    }

    @Override
    public void udskrivInfo() {
        super.udskrivInfo();
        System.out.println("Uddannelse: " + uddannelse);
        System.out.println("Ansættelsesgrad: " + ansaettelsesgrad + "%");
        System.out.println("Timeløn: " + timeloen);
    }
}

