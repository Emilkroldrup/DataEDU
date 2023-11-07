package biblo;

public class Bog {
    private int bogId;
    private String titel;
    private String forfatter;
    private boolean udlant;
    private String udlaensDato;
    private int laenerId;

    public Bog() {
    }

    public Bog(int bogId, String titel, String forfatter) {
        this.bogId = bogId;
        this.titel = titel;
        this.forfatter = forfatter;
        this.udlant = false;
        this.udlaensDato = "";
        this.laenerId = 0;
    }

    // Getters and setters ...

    public int getBogId() {
        return bogId;
    }

    public void setBogId(int bogId) {
        this.bogId = bogId;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getForfatter() {
        return forfatter;
    }

    public void setForfatter(String forfatter) {
        this.forfatter = forfatter;
    }

    public boolean isUdlant() {
        return udlant;
    }

    public void setUdlant(boolean udlant) {
        this.udlant = udlant;
    }

    public String getUdlaensDato() {
        return udlaensDato;
    }

    public void setUdlaensDato(String udlaensDato) {
        this.udlaensDato = udlaensDato;
    }

    public int getLaener() {
        return laenerId;
    }

    public void setLaener(int laenerId) {
        this.laenerId = laenerId;
    }

    public void udlaenBog(int laenerId, String udlaensDato){
        if (!this.udlant) {
            this.laenerId = laenerId;
            this.udlaensDato = udlaensDato;
            this.udlant = true;
        } else {
            System.out.println("Book is already lent out.");
        }
    }

    public void afleverBog() {
        this.udlant = false;
        this.laenerId = 0;
        this.udlaensDato = "";
    }

    @Override
    public String toString() {
        return "Bog{" +
                "bogId=" + bogId +
                ", titel='" + titel + '\'' +
                ", forfatter='" + forfatter + '\'' +
                ", udlant=" + udlant +
                ", udlaensDato='" + udlaensDato + '\'' +
                ", laener=" + laenerId +
                '}';
    }
}
