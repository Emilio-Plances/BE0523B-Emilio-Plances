package it.epicode.month1.week1.day1;

import java.util.Arrays;
import java.util.Scanner;

public class MultiFunction {
    public static void main(String[] abs){
        Scanner scanner=new Scanner(System.in);
        String string1, string2;
        String[] stringArr={"-",">","<","-","-",""};
        int number1,number2;


        System.out.println("Quale operazione vuoi svolgere?(inserire il numero corrispondente " +
                "\n1.Concatenazione \n2.Moltiplicazione \n3.Aggiungi all'Array");
        number1= scanner.nextInt();
        scanner.nextLine();

        switch(number1){
            case 1:
                System.out.println("Enter first string");
                string1= scanner.nextLine();

                System.out.println("Enter a number");
                number1= scanner.nextInt();

                System.out.println(concatena(string1,number1));
                break;
            case 2:
                System.out.println("Enter number 1");
                number1= scanner.nextInt();

                System.out.println("Enter number 2");
                number2= scanner.nextInt();

                System.out.println(moltiplica(number1,number2));
                break;
            case 3:
                System.out.println("Enter first string");
                string1= scanner.nextLine();
                System.out.println(Arrays.toString(inserisciInArray(stringArr,string1)));
                break;
            default:
                System.out.println("Il valore inserito non è valido");
                break;
        }
    }

    public static String[] inserisciInArray(String[] stringArr,String string){
        for(int i=stringArr.length-1;i>2;i--){
            stringArr[i]=stringArr[i-1];
        }
        stringArr[2]=string;
        return stringArr;
    }
    public static String concatena(String string1,int num){
        return string1+" "+num;
    }
    public static int moltiplica(int number1,int number2){
        return number1*number2;
    }
}
