package Opgave7;

public class Servicemedarbejder extends Ansat {
    private Speciale speciale;
    private double timeloen;

    public Speciale getSpeciale() {
        return speciale;
    }

    public void setSpeciale(Speciale speciale) {
        this.speciale = speciale;
    }

    public double getTimeloen() {
        return timeloen;
    }

    public void setTimeloen(double timeloen) {
        this.timeloen = timeloen;
    }

    public enum Speciale {
        TØMRER, VVS, ELEKTRIKER
    }

    public Servicemedarbejder(String medarbejderNr, String fnavn, String enavn, String adresse, String ansaettelsesdato, int afdelingsNummer, Speciale speciale, double timeloen) {
        super(medarbejderNr, fnavn, enavn, adresse, ansaettelsesdato, afdelingsNummer);
        this.speciale = speciale;
        this.timeloen = timeloen;
    }

    @Override
    public void udskrivInfo() {
        super.udskrivInfo();
        System.out.println("Speciale: " + speciale);
        System.out.println("Timeløn: " + timeloen);
    }
}

