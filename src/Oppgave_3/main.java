package Oppgave_3;

import java.util.HashSet;

public class main {
    public static void main(String[] args) {
        //a
        HashSet<String> mengde1 = new HashSet<>();
        HashSet<String> mengde2 = new HashSet<>();


        mengde1.add("A");
        mengde1.add("B");
        mengde1.add("C");
        mengde1.add("D");
        mengde1.add("B");

        mengde2.add("D");
        mengde2.add("E");
        mengde2.add("F");
        mengde2.add("G");
        mengde2.add("F");

        for(String t : mengde1){
            System.out.print(t + " ");
        }
        System.out.println();
        for(String t : mengde2){
            System.out.print(t + " ");
        }
        System.out.println();

        //b
        HashSet<String> snitt = new HashSet<>();
        snitt.addAll(mengde1);
        snitt.retainAll(mengde2);

        for(String t : snitt){
            System.out.print(t + " ");
        }
        System.out.println();

        //c
        HashSet<String> union = new HashSet<>();
        union.addAll(mengde1);
        union.addAll(mengde2);

        for (String t : union){
            System.out.print(t + " ");
        }
        System.out.println();
    }
}
