package Oppgave_2;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        //a
        ArrayList<Integer> liste = new ArrayList<>();

        for (int i = 1; i < 5; i++){
            liste.add(i);
        }
        liste.add(2);

        //liste.add("per");

        System.out.println(liste.get(3) + " " + liste.get(4));

        //b
        System.out.println(liste.size());
        liste.add(1, 5);

        //c
        System.out.println(liste.contains(1));
        System.out.println(liste.contains(6));

        //d
        System.out.println(liste.indexOf(2));
        System.out.println(liste.lastIndexOf(2));

        //e
        System.out.println(liste.isEmpty());
        liste.clear();
        System.out.println(liste.isEmpty());
    }

}
