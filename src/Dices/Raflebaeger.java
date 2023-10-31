package Dices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Raflebaeger {

    private ArrayList<Terning> raflebaeger;

    public Raflebaeger() {
        raflebaeger = new ArrayList<Terning>();
    }

    public void tilfoej(Terning t) {
        raflebaeger.add(t);
    }

    public void ryst() {
        for (Terning t : raflebaeger)
            t.kast();
    }

    public void udskrivindhold() {
        for (Terning t : raflebaeger)
            System.out.print(t.toString());
        System.out.println("\nSummen er: " + sum());
        checkConditions();
    }

    private int sum() {
        int s = 0;
        for (Terning t : raflebaeger)
            s += t.getVaerdi();
        return s;
    }

    private void checkConditions() {
        if (allDiceSame()) {
            System.out.println("Alle terninger viser det samme øjental!");
        }
        System.out.println("Antal 4'ere i slaget: " + countFours());

        if (fiveDiceStraight(1, 5)) {
            System.out.println("5 af terningerne viser øjentallene fra 1-5");
        }

        if (fiveDiceStraight(2, 6)) {
            System.out.println("5 af terningerne viser øjentallene fra 2-6");
        }

        if (containsSame(3)) {
            System.out.println("Slaget indeholder 3 ens øjental");
        }

        if (containsSame(4)) {
            System.out.println("Slaget indeholder 4 ens øjental");
        }
    }

    private boolean allDiceSame() {
        int firstValue = raflebaeger.get(0).getVaerdi();
        for (Terning t : raflebaeger) {
            if (t.getVaerdi() != firstValue) {
                return false;
            }
        }
        return true;
    }

    private int countFours() {
        int count = 0;
        for (Terning t : raflebaeger) {
            if (t.getVaerdi() == 4) {
                count++;
            }
        }
        return count;
    }

    private boolean fiveDiceStraight(int start, int end) {
        Map<Integer, Integer> diceCounts = new HashMap<>();
        for (Terning t : raflebaeger) {
            diceCounts.put(t.getVaerdi(), diceCounts.getOrDefault(t.getVaerdi(), 0) + 1);
        }

        for (int i = start; i <= end; i++) {
            if (!diceCounts.containsKey(i) || diceCounts.get(i) < 1) {
                return false;
            }
            diceCounts.put(i, diceCounts.get(i) - 1);
        }
        return true;
    }

    private boolean containsSame(int count) {
        Map<Integer, Integer> diceCounts = new HashMap<>();
        for (Terning t : raflebaeger) {
            diceCounts.put(t.getVaerdi(), diceCounts.getOrDefault(t.getVaerdi(), 0) + 1);
        }

        for (int val : diceCounts.values()) {
            if (val >= count) {
                return true;
            }
        }
        return false;
    }
    public ArrayList<Terning> getTerninger() {
        return new ArrayList<>(raflebaeger);
    }

}
