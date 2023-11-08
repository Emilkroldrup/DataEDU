package Studie;

import java.util.ArrayList;

public class Skole {
    private ArrayList<Studerende> studerendeListe;
    private ArrayList<Fag> fagListe;
    private ArrayList<Laerer> laererListe;

    public Skole() {
        this.studerendeListe = new ArrayList<>();
        this.fagListe = new ArrayList<>();
        this.laererListe = new ArrayList<>();
    }

    // Methods to add a student, teacher, or subject
    public void addStuderende(Studerende s) {
        studerendeListe.add(s);
    }

    public void addLaerer(Laerer l) {
        laererListe.add(l);
    }

    public void addFag(Fag f) {
        fagListe.add(f);
    }

    // Methods to get a student, teacher, or subject by their ID
    public Studerende getStuderende(int stdNr) {
        for (Studerende s : studerendeListe) {
            if (s.getStdnr() == stdNr) {
                return s;
            }
        }
        return null;
    }

    public Laerer getLaerer(int laererNr) {
        for (Laerer l : laererListe) {
            if (l.getLaererNr() == laererNr) {
                return l;
            }
        }
        return null;
    }

    public Fag getFag(int fagNr) {
        for (Fag f : fagListe) {
            if (f.getFagnr() == fagNr) {
                return f;
            }
        }
        return null;
    }

    // Methods to enroll a student in a subject and assign a teacher to a subject
    public void enrollStuderendeToFag(int stdNr, int fagNr) {
        Studerende s = getStuderende(stdNr);
        Fag f = getFag(fagNr);
        if (s != null && f != null) {
            s.getTilmeldteFag().add(f);
            f.getKlasseListe().add(s);
        }
    }

    public void assignLaererToFag(int laererNr, int fagNr) {
        Laerer l = getLaerer(laererNr);
        Fag f = getFag(fagNr);
        if (l != null && f != null) {
            l.getFagListe().add(f);
            f.setLaerer(l);
        }
    }

    // Additional methods as needed...

    // Getters and setters
    public ArrayList<Studerende> getStuderendeListe() {
        return studerendeListe;
    }

    public void setStuderendeListe(ArrayList<Studerende> studerendeListe) {
        this.studerendeListe = studerendeListe;
    }

    public ArrayList<Fag> getFagListe() {
        return fagListe;
    }

    public void setFagListe(ArrayList<Fag> fagListe) {
        this.fagListe = fagListe;
    }

    public ArrayList<Laerer> getLaererListe() {
        return laererListe;
    }

    public void setLaererListe(ArrayList<Laerer> laererListe) {
        this.laererListe = laererListe;
    }

    @Override
    public String toString() {
        return "Skole{" +
                "studerendeListe=" + studerendeListe +
                ", fagListe=" + fagListe +
                ", laererListe=" + laererListe +
                '}';
    }
}
