package Oppgave_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
// HashMap
public class main {
    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<>();

        liste.add("er");
        liste.add("det");
        liste.add("alle");
        liste.add("er");
        liste.add("det");
        liste.add("det");

        HashMap<String, Integer> map = new HashMap<>();

        for(String t : liste){
            if (map.containsKey(t)){
                map.replace(t, map.get(t)+1);
            }
            else{
               map.put(t,1);
            }
        }

        Scanner myObj = new Scanner(System.in);
        System.out.println("Ord:");
        String ord = myObj.nextLine();
        System.out.println(map.get(ord));

    }
}
