package it.epicode.month1.week1.day2;

import java.util.Scanner;

public class Switch {
    public static void main(String[] abs){
        Scanner scanner=new Scanner(System.in);
        int dato1;

        System.out.println("Inserire un numero");
        dato1= scanner.nextInt();
        System.out.println(convertToChar(dato1));
    }

    public static String convertToChar(int num){
        return switch (num) {
            case 1 -> "A";
            case 2 -> "B";
            case 3 -> "C";
            default -> "Valore non valido";
        };
    }
}
