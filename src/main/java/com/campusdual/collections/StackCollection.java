package com.campusdual.collections;

import java.util.Stack;

public class StackCollection {
    public static void main(String[] args) {
        Stack<String> instruments = new Stack<>();

        instruments.push("Guitarra");
        instruments.push("Batería");
        instruments.push("Flauta");
        instruments.push("Bajo");

        String removedItem = instruments.pop();
        System.out.println("Removed instrument: " + removedItem);
        String peekedItem = instruments.peek();
        System.out.println("Peeked instrument: " +peekedItem);
    }
}
