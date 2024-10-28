package com.campusdual.collections;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {
    public static void main(String[] args) {
        Set<String> instruments = new HashSet<>();
        instruments.add("Guitarra");
        instruments.add("Piano");
        instruments.add("Piano");
        instruments.add("Batería");
        instruments.add("Batería");
        instruments.add("Bass");
        instruments.add("Bass");

        System.out.println("Set of musical intruments: ");
        for(String instrument : instruments){
            System.out.println(instrument);
        }

        instruments.remove("Batería");
        instruments.add("Flauta");
        System.out.println("Set after modification: ");

    }
}
