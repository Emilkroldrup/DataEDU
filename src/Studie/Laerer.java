package Studie;

import java.util.ArrayList;

public class Laerer {
    private int laererNr;
    private String fnavn;
    private String enavn;
    private String adresse;
    private String postnr;
    private String mobil;
    private ArrayList<Fag> fagListe;

    public Laerer(int laererNr, String fnavn, String enavn, String adresse, String postnr, String mobil, ArrayList<Fag> fagListe) {
        this.laererNr = laererNr;
        this.fnavn = fnavn;
        this.enavn = enavn;
        this.adresse = adresse;
        this.postnr = postnr;
        this.mobil = mobil;
        this.fagListe = fagListe;
    }

    public int getLaererNr() {
        return laererNr;
    }

    public String getFnavn() {
        return fnavn;
    }

    public String getEnavn() {
        return enavn;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getPostnr() {
        return postnr;
    }

    public String getMobil() {
        return mobil;
    }

    public ArrayList<Fag> getFagListe() {
        return fagListe;
    }

    public void setLaererNr(int laererNr) {
        this.laererNr = laererNr;
    }

    public void setFnavn(String fnavn) {
        this.fnavn = fnavn;
    }

    public void setEnavn(String enavn) {
        this.enavn = enavn;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setPostnr(String postnr) {
        this.postnr = postnr;
    }

    public void setMobil(String mobil) {
        this.mobil = mobil;
    }

    public void setFagListe(ArrayList<Fag> fagListe) {
        this.fagListe = fagListe;
    }

    @Override
    public String toString() {
        return "Laerer{" +
                "laererNr=" + laererNr +
                ", fnavn='" + fnavn + '\'' +
                ", enavn='" + enavn + '\'' +
                ", adresse='" + adresse + '\'' +
                ", postnr='" + postnr + '\'' +
                ", mobil='" + mobil + '\'' +
                ", fagListe=" + fagListe +
                '}';
    }
}

