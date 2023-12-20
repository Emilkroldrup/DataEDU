package Opgave7;

public class Leder extends Ansat {
    private int lederniveau;
    private double maanedslon;

    public int getLederniveau() {
        return lederniveau;
    }

    public void setLederniveau(int lederniveau) {
        this.lederniveau = lederniveau;
    }

    public double getMaanedslon() {
        return maanedslon;
    }

    public void setMaanedslon(double maanedslon) {
        this.maanedslon = maanedslon;
    }

    public Leder(String medarbejderNr, String fnavn, String enavn, String adresse, String ansaettelsesdato, int afdelingsNummer, int lederniveau, double maanedslon) {
        super(medarbejderNr, fnavn, enavn, adresse, ansaettelsesdato, afdelingsNummer);
        this.lederniveau = lederniveau;
        this.maanedslon = maanedslon;
    }

    @Override
    public void udskrivInfo() {
        super.udskrivInfo();
        System.out.println("Lederniveau: " + lederniveau);
        System.out.println("Månedsløn: " + maanedslon);
    }
}

