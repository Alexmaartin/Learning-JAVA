package com.campusdual.input;

import com.campusdual.Utils;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Input {

        public static void useScannerToGetName(){
            Scanner Scanner = new Scanner(System.in);
            //System.out.print("Write your name:");
            String name = Scanner.nextLine();
            System.out.println("Hello" + name);

        }
        public static void useUtilsToGetName(){
            int name = Utils.integer("write your name:");
            System.out.println("Hi"+ name);
        }

        public static void main(String[] args) {

            //useScannerToGetName();
            useUtilsToGetName();
    }
}
