package it.epicode.month1.week1.day1;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Geometry {
    public static void main(String[] abs){
        Scanner scanner=new Scanner(System.in);
        float dato1,dato2,dato3;
        int number;

        System.out.println("Cosa vuoi fare? \n1.Perimetro Rettangolo\n2.Pari o Dispari\n3.Area Triangolo");
        number=scanner.nextInt();
        switch(number){
            case 1:
                System.out.println("Quanto è lunga la base?");
                dato1=scanner.nextInt();

                System.out.println("Quanto è lunga l'altezza?");
                dato2=scanner.nextInt();

                System.out.println(perimetroRettangolo(dato1,dato2));
                break;
            case 2:
                System.out.println("Se pari uscirà 1 altrimenti uscirà 0.\nInserisci numero");
                number=scanner.nextInt();
                System.out.println(pariDispari(number));
                break;
            case 3:
                System.out.println("Lato 1");
                dato1= scanner.nextFloat();
                System.out.println("Lato 2");
                dato2= scanner.nextFloat();
                System.out.println("Lato 1");
                dato3= scanner.nextFloat();
                System.out.println(areaTriangolo(dato1,dato2,dato3));
                break;
            default:
                System.out.println("Il valore inserito non è valido");
                break;
        }


    }
    public static float perimetroRettangolo(float num1,float num2){
        return (num1+num2)*2;
    }
    public static int pariDispari(int number){
        if(number%2==0){return 1;}
        else{return 0;}
    }
    public static double areaTriangolo(float num1, float num2, float num3){
        float p=num1+num2+num3;
        return Math.sqrt(p*(p-num1)*(p-num2)*(p-num3));
    }
}
