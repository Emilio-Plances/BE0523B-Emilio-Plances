package it.epicode.month1.week1.day1;

import java.util.Scanner;

public class TripleStrings {
    public static void main(String[] abs){
        Scanner scanner=new Scanner(System.in);
        String string1,string2,string3;

        System.out.println("Inserire 1^ stringa:");
        string1=scanner.nextLine();

        System.out.println("Inserire 2^ stringa:");
        string2=scanner.nextLine();

        System.out.println("Inserire 3^ stringa:");
        string3=scanner.nextLine();

        System.out.println("In ordine: "+string1+" "+string2+" "+string3);
        System.out.println("Inverso: "+string3+" "+string2+" "+string1);
    }
}
