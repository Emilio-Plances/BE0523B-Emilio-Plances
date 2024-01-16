package it.epicode.month1.week2.day2;

import java.util.*;

public class BigList {
    private static final Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        Set<String> stringSet=new HashSet<>();
        Set<String> duplicate=new HashSet<>();

        int n=enterNumber();

        for(int i=0;i<n;i++){
            String sInput=enterString();
            if(stringSet.add(sInput)) stringSet.add(sInput);
            else duplicate.add(sInput);
        }
        System.out.println("Parole duplicate: "+duplicate);
        System.out.println("Hai inserito "+stringSet.size()+" valori unici");
        System.out.println("Parole distinte: "+stringSet);
    }
    public static String enterString(){
        System.out.println("Inserisci una parola");
        return scanner.nextLine();
    }
    public static int enterNumber(){
        int n;
        while(true){
            try{
                n=inputPositiveNumber();
                break;
            }catch(InputMismatchException ex){
                System.out.println("Inserisci un dato valido");
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        return n;
    }
    private static int inputPositiveNumber() throws Exception{
        System.out.println("Quanti elementi vuoi inserire?");
        int n =scanner.nextInt();
        if(n<1) throw new Exception("Inserire un numero superiore a 0");
        scanner.nextLine();
        return n;
    }
}
