package Studie;

import java.util.ArrayList;

public class Fag {
    private int fagnr;
    private String fagNavn;
    private Laerer laerer;
    private ArrayList<Studerende> klasseListe;

    public Fag(int fagnr, String fagNavn, Laerer laerer, ArrayList<Studerende> klasseListe) {
        this.fagnr = fagnr;
        this.fagNavn = fagNavn;
        this.laerer = laerer;
        this.klasseListe = klasseListe;
    }
    public int getFagnr() {
        return fagnr;
    }

    public void setFagnr(int fagnr) {
        this.fagnr = fagnr;
    }

    public String getFagNavn() {
        return fagNavn;
    }

    public void setFagNavn(String fagNavn) {
        this.fagNavn = fagNavn;
    }

    public Laerer getLaerer() {
        return laerer;
    }

    public void setLaerer(Laerer laerer) {
        this.laerer = laerer;
    }

    public ArrayList<Studerende> getKlasseListe() {
        return klasseListe;
    }

    public void setKlasseListe(ArrayList<Studerende> klasseListe) {
        this.klasseListe = klasseListe;
    }

    @Override
    public String toString() {
        return "Fag{" +
                "fagnr=" + fagnr +
                ", fagNavn='" + fagNavn + '\'' +
                ", laerer=" + laerer +
                ", klasseListe=" + klasseListe +
                '}';
    }
}


