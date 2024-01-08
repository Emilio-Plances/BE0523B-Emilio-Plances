package it.epicode.month1.week1.day1;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] abs){
        Scanner scanner=new Scanner(System.in);
        float data1,data2,data3;
        int number;

        System.out.println("Cosa vuoi fare? \n1.Perimetro Rettangolo\n2.Pari o Dispari\n3.Area Triangolo");
        number=scanner.nextInt();
        switch(number){
            case 1:
                System.out.println("Quanto è lunga la base?");
                data1=scanner.nextInt();

                System.out.println("Quanto è lunga l'altezza?");
                data2=scanner.nextInt();

                System.out.println(perimetroRettangolo(data1,data2));
                break;
            case 2:
                System.out.println("Inserisci numero");
                number=scanner.nextInt();
                if(pariDispari(number)==0){
                    System.out.println("È pari");
                }else{
                    System.out.println("È dispari");
                }
                break;
            case 3:
                System.out.println("Lato 1");
                data1= scanner.nextFloat();
                System.out.println("Lato 2");
                data2= scanner.nextFloat();
                System.out.println("Lato 1");
                data3= scanner.nextFloat();
                System.out.println(areaTriangolo(data1,data2,data3));
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
        if(number%2==0){return 0;}
        else{return 1;}
    }
    public static double areaTriangolo(float num1, float num2, float num3){
        float p=num1+num2+num3;
        return Math.sqrt(p*(p-num1)*(p-num2)*(p-num3));
    }
}
