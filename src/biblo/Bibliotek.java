package biblo;

import java.util.ArrayList;

public class Bibliotek {
    private ArrayList<Bog> bogListe=new ArrayList<>();
    private ArrayList<Laener> laenerListe=new ArrayList<>();

    public Bibliotek() {
    }

    public Bibliotek(ArrayList<Bog> bogListe, ArrayList<Laener> laenerListe) {
        this.bogListe = bogListe;
        this.laenerListe = laenerListe;
    }

    public ArrayList<Bog> getBogListe() {
        return bogListe;
    }

    public void setBogListe(ArrayList<Bog> bogListe) {
        this.bogListe = bogListe;
    }

    public ArrayList<Laener> getLaenerListe() {
        return laenerListe;
    }

    public void setLaenerListe(ArrayList<Laener> laenerListe) {
        this.laenerListe = laenerListe;
    }

    public void tilfoejBog(Bog b){
        if (!bogListe.contains(b)) {
            bogListe.add(b);
        }
    }

    public void tilfoejBog(int bogId, String t,String f) {
        for (Bog bog : bogListe) {
            if (bog.getBogId() == bogId) {
                return;
            }
        }
        bogListe.add(new Bog(bogId, t, f));
    }


    public void tilfoejLaener(Laener l){
        if (!laenerListe.contains(l)) {
            laenerListe.add(l);
        }
    }

    public void tilfoejLaener(int lId,String fnavn, String enavn) {
        for (Laener laener : laenerListe) {
            if (laener.getlNr() == lId) {
                return;
            }
        }
        laenerListe.add(new Laener(lId, fnavn, enavn));
    }

    public void udlaenBog(int bogId,int lId,String dato){
        Bog bog = getBog(bogId);
        if (bog != null && !bog.isUdlant()) {
            Laener laener = getLaener(lId);
            if (laener != null) {
                bog.udlaenBog(lId, dato);
                laener.laenBog(bogId);
            }
        }
    }

    public boolean erBogUdlant(int bogId){
        Bog bog = getBog(bogId);
        return bog != null && bog.isUdlant();
    }

    public void afleverBog(int bogId){
        Bog bog = getBog(bogId);
        if (bog != null && bog.isUdlant()) {
            Laener laener = getLaener(bog.getLaener());
            if (laener != null) {
                laener.afleverBog(bogId);
                bog.afleverBog();
            }
        }
    }

    public ArrayList<Bog> udlanteBoeger(){
        ArrayList<Bog> udlantListe = new ArrayList<>();
        for (Bog bog : bogListe) {
            if (bog.isUdlant()) {
                udlantListe.add(bog);
            }
        }
        return udlantListe;
    }

    public Bog getBog(int bogId){
        for (Bog bog : bogListe) {
            if (bog.getBogId() == bogId) {
                return bog;
            }
        }
        return null;
    }

    public Laener getLaener(int lId){
        for (Laener laener : laenerListe) {
            if (laener.getlNr() == lId) {
                return laener;
            }
        }
        return null;
    }

    public Laener bogUdlantTil(int bogId){
        Bog bog = getBog(bogId);
        if (bog != null && bog.isUdlant()) {
            return getLaener(bog.getLaener());
        }
        return null;
    }

}