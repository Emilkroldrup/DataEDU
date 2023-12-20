import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class Opgave6 {

    public static void main(String[] args) {
        // Task b
        ArrayList<Integer> gradesA = new ArrayList<>(Arrays.asList(2,4,7,0,-3,7,10,12,12,7,2,7,4,10,10,12,0,7,7,4));
        Opgave6 klasseA = new Opgave6(gradesA);
        // Task c
        System.out.println("Klasse A - Antal karakterer: " + klasseA.antalKarakterer());
        System.out.println("Klasse A - Mindste karakter: " + klasseA.min());
        System.out.println("Klasse A - Største karakter: " + klasseA.max());
        System.out.println("Klasse A - Gennemsnit: " + klasseA.snit());
        System.out.println("Klasse A - Antal bestået: " + klasseA.antalBestaet());
        System.out.println("Klasse A - Antal med karakteren 7: " + klasseA.antalMedKar(7));
        System.out.println("Klasse A - Antal med mindst karakteren 10: " + klasseA.antalMedMindstKar(10));

        System.out.println();
        // Task d
        ArrayList<Integer> gradesB = new ArrayList<>(Arrays.asList(12,2,-3,2,2,4,4,7,7,10,12,4,4,7,7,2,2,10,2,7));
        Opgave6 klasseB = new Opgave6(gradesB);
        System.out.println("Klasse B - Antal karakterer: " + klasseB.antalKarakterer());
        System.out.println("Klasse B - Mindste karakter: " + klasseB.min());
        System.out.println("Klasse B - Største karakter: " + klasseB.max());
        System.out.println("Klasse B - Gennemsnit: " + klasseB.snit());
        System.out.println("Klasse B - Antal bestået: " + klasseB.antalBestaet());
        System.out.println("Klasse B - Antal med karakteren 7: " + klasseB.antalMedKar(7));
        System.out.println("Klasse B - Antal med mindst karakteren 10: " + klasseB.antalMedMindstKar(10));

        System.out.println();

        ArrayList<Integer> gradesC = new ArrayList<>(Arrays.asList(10,12,7,7,10,2,4,10,12,10,7,7,2,2,4,7,4,2,12,12));
        Opgave6 klasseC = new Opgave6(gradesC);
        System.out.println("Klasse C - Antal karakterer: " + klasseC.antalKarakterer());
        System.out.println("Klasse C - Mindste karakter: " + klasseC.min());
        System.out.println("Klasse C - Største karakter: " + klasseC.max());
        System.out.println("Klasse C - Gennemsnit: " + klasseC.snit());
        System.out.println("Klasse C - Antal bestået: " + klasseC.antalBestaet());
        System.out.println("Klasse C - Antal med karakteren 7: " + klasseC.antalMedKar(7));
        System.out.println("Klasse C - Antal med mindst karakteren 10: " + klasseC.antalMedMindstKar(10));

        System.out.println();

        double highestAverage = Math.max(Math.max(klasseA.snit(), klasseB.snit()), klasseC.snit());
        System.out.println("Average er: " + highestAverage);

        System.out.println();

        double lowestAverage = Math.min(Math.min(klasseA.snit(), klasseB.snit()), klasseC.snit());
        System.out.println("Laveste average er: " + lowestAverage);

        System.out.println();

        int mostTwelves = Math.max(Math.max(klasseA.antalMedKar(12), klasseB.antalMedKar(12)), klasseC.antalMedKar(12));
        System.out.println("Fleste 12 taller: " + mostTwelves);

        System.out.println();

        int mostFailures = Math.max(Math.max(klasseA.antalMedMindstKar(2), klasseB.antalMedMindstKar(2)), klasseC.antalMedMindstKar(2));
        System.out.println("Flest fejlede er: " + mostFailures);

        System.out.println();

        int twelvesA = klasseA.antalMedKar(12);
        int twelvesB = klasseB.antalMedKar(12);
        int twelvesC = klasseC.antalMedKar(12);
        String mostTwelvesClass = twelvesA > twelvesB ? (twelvesA > twelvesC ? "Klasse A" : "Klasse C") : (twelvesB > twelvesC ? "Klasse B" : "Klasse C");
        if (twelvesA == twelvesB && twelvesB == twelvesC) {
            mostTwelvesClass = "Alle klasser har samme antal 12-taller";
        }
        System.out.println("Klassen med flest 12-taller er: " + mostTwelvesClass);

        System.out.println();

        int failuresA = klasseA.antalMedMindstKar(2);
        int failuresB = klasseB.antalMedMindstKar(2);
        int failuresC = klasseC.antalMedMindstKar(2);
        String mostFailuresClass = failuresA < failuresB ? (failuresA < failuresC ? "Klasse A" : "Klasse C") : (failuresB < failuresC ? "Klasse B" : "Klasse C");
        if (failuresA == failuresB && failuresB == failuresC) {
            mostFailuresClass = "Alle klasser har samme antal fejlede";
        }
        System.out.println("Klassen med flest fejlede (karakterer under 2) er: " + mostFailuresClass);

        System.out.println();

        int negativeThreesA = klasseA.antalMedKar(-3);
        int negativeThreesB = klasseB.antalMedKar(-3);
        int negativeThreesC = klasseC.antalMedKar(-3);
        String fewestNegativeThreesClass = negativeThreesA < negativeThreesB ? (negativeThreesA < negativeThreesC ? "Klasse A" : "Klasse C") : (negativeThreesB < negativeThreesC ? "Klasse B" : "Klasse C");
        if (negativeThreesA == negativeThreesB && negativeThreesB == negativeThreesC) {
            fewestNegativeThreesClass = "Alle klasser har samme antal -3";
        }
        System.out.println("Klassen med færrest -3 karakterer er: " + fewestNegativeThreesClass);

    }
    private ArrayList<Integer> karakterListe;

    Opgave6(ArrayList<Integer> karakterListe) {
        this.karakterListe = new ArrayList<>(karakterListe);
    }

    public void setKarakterListe(ArrayList<Integer> karakterListe) {
        this.karakterListe = karakterListe;
    }

    public ArrayList<Integer> getKarakterListe() {
        return this.karakterListe;
    }

    public void tilfoejKarakter(int kar) {
        this.karakterListe.add(kar);
    }

    public int antalKarakterer() {
        return this.karakterListe.size();
    }

    public int min() {
        return Collections.min(this.karakterListe);
    }

    public int max() {
        return Collections.max(this.karakterListe);
    }

    public double snit() {
        if (this.karakterListe.isEmpty()) return 0;
        return this.karakterListe.stream().mapToDouble(a -> a).average().getAsDouble();
    }

    public int antalBestaet() {
        return (int) this.karakterListe.stream().filter(kar -> kar >= 2).count();
    }

    public int antalMedKar(int k) {
        return (int) this.karakterListe.stream().filter(kar -> kar == k).count();
    }

    public int antalMedMindstKar(int k) {
        return (int) this.karakterListe.stream().filter(kar -> kar >= k).count();
    }
}
