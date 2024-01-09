package it.epicode.month1.week1.day2;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int dato1;

        System.out.println("Inserire numero per countdown");
        dato1= scanner.nextInt();
        for(int i=dato1;i>0;i--){
            System.out.println(i);
        }
    }
}
