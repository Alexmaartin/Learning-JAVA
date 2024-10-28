package com.campusdual.collections;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {
    public static void main(String[] args) {
        List<String> instruments = new ArrayList<>();
        instruments.add("Guitarra");
        instruments.add("Piano");
        instruments.add("Batería");
        instruments.add("Bass");

        for (int i = 0; i < instruments.size(); i++){
            System.out.println("Instrument at index " + i + ":" + instruments.get(i));

        }

        instruments.remove("Piano");

        for (String item   : instruments){
            System.out.println(item);

        }
    }
}
