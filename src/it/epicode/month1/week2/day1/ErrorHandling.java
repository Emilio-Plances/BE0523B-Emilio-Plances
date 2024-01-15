package it.epicode.month1.week2.day1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class ErrorHandling {
    private static final Logger logger= LoggerFactory.getLogger(Consumi.class);
    public static void main(String[] args) {
        int[] myArray=new int[5];
        int number,position;

        for (int i=0;i<myArray.length;i++){
            myArray[i]=(int)(Math.random()*10);
        }

        printArray(myArray);

        while(true){
            try{
                number=enterNumber();
                position=enterPosition();
                myArray[position-1]=number;
                printArray(myArray);
            }catch(WrongNumberException ex){
                System.out.println(ex.getMessage());
                logger.error("Valore non valido");
                continue;
            }
            if(number==0) break;
        }
    }
    public static int enterNumber() throws WrongNumberException {
        Scanner scanner=new Scanner(System.in);
        int number;

        System.out.println("Che numero vuoi inserire? Inserisci 0 per uscire");
        number=scanner.nextInt();

        if(number<0 || number>10) throw new WrongNumberException("Numero inserito non valido!");
        return number;
    }
    public static int enterPosition() throws WrongNumberException {
        Scanner scanner=new Scanner(System.in);
        int number;

        System.out.println("In che posizione?");
        number=scanner.nextInt();

        if(number<1 || number>5) throw new WrongNumberException("Numero inserito non valido!");
        return number;
    }
    public static void printArray(int[] myArray){
        for (int i=0;i< myArray.length;i++){
            System.out.println((i+1)+"."+myArray[i]);
        }

    }
}
