package it.epicode.month1.week2.day2;

import java.util.*;

public class OrderedList {
    public static final Scanner scanner=new Scanner(System.in);
    public static final Random random=new Random();
    public static void main(String[] args) {
        int n=enterNumber();

        List<Integer> count;

        count=createSortedArray(n);
        System.out.println(count);

        count=mirrorList(n,count);
        System.out.println(count);

        odd(true,count);
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

    private static List<Integer> createSortedArray(int n){
        ArrayList<Integer> myList=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            myList.add(random.nextInt(100));
        }
        Collections.sort(myList);
        return myList;
    }
    private static List<Integer> mirrorList(int n,List<Integer> myList){
        for(int i=n;i>0;i--){
            myList.add(myList.get(i-1));
        }
        return myList;
    }
    private static void odd(boolean bool,List<Integer> myList ){
        for(int i=bool?0:1;i<myList.size();i+=2){
            System.out.println(myList.get(i+1));
        }
    }
}
