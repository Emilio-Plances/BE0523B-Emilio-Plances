package it.epicode.month1.week2.day1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Consumi {
    private static final Logger logger= LoggerFactory.getLogger(Consumi.class);
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float km,l;
        try{
            System.out.println("Quanti chilometri hai percorso?");
            km=enterInput(scanner);
            System.out.println("Quanti litri hai consumato?");
            l=enterInput(scanner);
            System.out.println("Il consumo è di "+(km/l)+" km/l");
        }catch(WrongNumberException ex){
            System.out.println(ex.getMessage());
            logger.error("Valore non valido");
            System.out.println("Chiusura programma...");
        }
    }
    public static float enterInput(Scanner scanner) throws WrongNumberException {

        float number=scanner.nextFloat();
        if(number<=0) throw new WrongNumberException("Numero inserito non valido");
        return number;
    }
}
