package com.campusdual.methods;

public class Method {
        public static int arithmeticOperators(){
                int value = 5;                      //5
                value = value + 3;                  //8
                value = 2 - value;                   //-6
                value += 3;
                value -= 1;
                value *= 4;
                value = (value - 2) / 2;
                int newValue = 3;
                int myValue = 2;
                value = newValue + myValue;
                final int CONST = 2;
                value = CONST;
                value += 3;
                value = value % 2;
                value++;
                value--;
               return value;
        }
    public static void logicOperators(){
        System.out.println(" 4 is equal to 4;" + (4==4));
        System.out.println(" 3 is different to 4;"+ (3!=4));
        System.out.println(" 3 is greater than 5;"+ (3>5));
        System.out.println(" 5 is less or equal than 5;"+ (5<=5));
        System.out.println("Unique true combination for AND;"+ (true && true));
        System.out.println("Unique false combination for or;"+ (false || false));
        System.out.println("NOT false; "+ (!false));
    }
    public static String myCustomMenssage(String custonName) {
        return "Hi " + custonName + "!This is your custom menssage";
    }
    public static void main(String[] args) {
        logicOperators();
        int arithResult = arithmeticOperators();
        System.out.println("Aritmetic result;"+ arithmeticOperators());
        String custonName = "Alex";
        String message = myCustomMenssage(custonName);
        System.out.println(message);
        System.out.println(myCustomMenssage("Paula"));

    }
    }
