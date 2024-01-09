package it.epicode.month1.week1.day2;

import java.util.Scanner;

public class If {
    public static void main(String[] abs){
        Scanner scanner=new Scanner(System.in);
        int dato1;

        System.out.println("Che vuoi fare?\n1.Pari o Dispari\n2.È bisestile?");
        dato1= scanner.nextInt();
        switch(dato1){
            case 1:
                System.out.println("Inserire un numero");
                dato1= scanner.nextInt();
                System.out.println(oddEven(dato1));
                break;
            case 2:
                System.out.println("Inserire un anno");
                dato1= scanner.nextInt();
                System.out.println(bisestile(dato1));
                break;
            default:
                System.out.println("Valore non valido");
        }
    }

    public static String oddEven(int num) {
        if (num % 2 == 0) {return "Pari";}
        else {return "Dispari";}
    }

    public static boolean bisestile(int anno){
        return anno%4==0;
    }
}
