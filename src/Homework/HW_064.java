package Homework;

import java.util.Scanner;

public class HW_064 {
    public static void main(String[] bars){

        Scanner scanner=new Scanner(System.in);
        int userInput=scanner.nextInt();

        for(int i=0;i< userInput*2; i++){
            System.out.print(i+" ");
        }

    }
}
