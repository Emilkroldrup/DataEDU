package Opgave7;

public class Ansat {
    protected String medarbejderNr;
    protected String fnavn;
    protected String enavn;
    protected String adresse;
    protected String ansaettelsesdato;
    protected int afdelingsNummer;

    public String getMedarbejderNr() {
        return medarbejderNr;
    }

    public void setMedarbejderNr(String medarbejderNr) {
        this.medarbejderNr = medarbejderNr;
    }

    public String getFnavn() {
        return fnavn;
    }

    public void setFnavn(String fnavn) {
        this.fnavn = fnavn;
    }

    public String getEnavn() {
        return enavn;
    }

    public void setEnavn(String enavn) {
        this.enavn = enavn;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getAnsaettelsesdato() {
        return ansaettelsesdato;
    }

    public void setAnsaettelsesdato(String ansaettelsesdato) {
        this.ansaettelsesdato = ansaettelsesdato;
    }

    public int getAfdelingsNummer() {
        return afdelingsNummer;
    }

    public void setAfdelingsNummer(int afdelingsNummer) {
        this.afdelingsNummer = afdelingsNummer;
    }

    public Ansat(String medarbejderNr, String fnavn, String enavn, String adresse, String ansaettelsesdato, int afdelingsNummer) {
        this.medarbejderNr = medarbejderNr;
        this.fnavn = fnavn;
        this.enavn = enavn;
        this.adresse = adresse;
        this.ansaettelsesdato = ansaettelsesdato;
        this.afdelingsNummer = afdelingsNummer;
    }

    public void udskrivInfo() {
        System.out.println("Medarbejder Nr: " + medarbejderNr);
        System.out.println("Navn: " + fnavn + " " + enavn);
        System.out.println("Adresse: " + adresse);
        System.out.println("Ansættelsesdato: " + ansaettelsesdato);
        System.out.println("Afdelingsnummer: " + afdelingsNummer);
    }
}

