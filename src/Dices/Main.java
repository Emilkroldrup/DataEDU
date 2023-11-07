package Dices;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Raflebaeger raflebaeger = new Raflebaeger();
        for (int i = 0; i < 6; i++) {
            raflebaeger.tilfoej(new Terning("Dice " + (i + 1)));
        }



        SnydeSpil spil1= new SnydeSpil();
      spil1.main();

        System.out.println("---------------------------------------------------");

       SnydeSpil2 spil2= new SnydeSpil2();
       spil2.main();

        System.out.println("---------------------------------------------------");

       Snydespil2medPolymorfi spil3=new Snydespil2medPolymorfi();
       spil3.main();

        System.out.println("---------------------------------------------------");

       Snydespil2medPolymorfi1 spil4=new Snydespil2medPolymorfi1();
       spil4.main();

        System.out.println("---------------------------------------------------");

       SnydespilMedRaflebaeger spil5=new SnydespilMedRaflebaeger();
       spil5.main();

        System.out.println("---------------------------------------------------");

        Yatzy yatzyGame = new Yatzy();
        for (int i = 0; i < 6; i++) {
            yatzyGame.addDie(new Terning("t" + (i + 1)));
        }
        yatzyGame.playRound();

    }

}


