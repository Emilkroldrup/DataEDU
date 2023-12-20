package Opgave7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Lavet service og admin med Enums, da det er nemmere at udvide med flere specialer og uddannelser og samtidig låse så det er specifikke værdier der kan bruges.
        Servicemedarbejder s1 = new Servicemedarbejder("123", "John", "Doe", "Vej 1", "01-01-2020", 101, Servicemedarbejder.Speciale.ELEKTRIKER, 200);
        Adminmedarbejder a1 = new Adminmedarbejder("456", "Jane", "Doe", "Vej 2", "02-02-2020", 102, Adminmedarbejder.Uddannelse.BOGHOLDER, 100, 150);
        Leder l1 = new Leder("789", "Jim", "Beam", "Vej 3", "03-03-2020", 103, 2, 5000);

        s1.udskrivInfo();
        System.out.println();
        a1.udskrivInfo();
        System.out.println();
        l1.udskrivInfo();
        System.out.println();
        System.out.println("Og så samme udskrivning med igennem en arraylist:");
        System.out.println();

        ArrayList<Ansat> ansatte = new ArrayList<>();
        ansatte.add(s1);
        ansatte.add(a1);
        ansatte.add(l1);

        for (Ansat ansat : ansatte) {
            ansat.udskrivInfo();
            System.out.println();
        }
    }
}

