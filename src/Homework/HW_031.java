package Homework;

import java.util.Scanner;

public class HW_031 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Is it sunny outside?");
        boolean isSunny=true;
        boolean weather=input.nextBoolean();
        if(isSunny==weather){
            System.out.println("It is a sunny day, I should go somewhere!");
            System.out.println("What is the temperature outside?");
            int temperature= input.nextInt();
            if (temperature>85){
                System.out.println("I am going to the beach");
            }else {
                System.out.println("I am going to the park");
            }
        }else {
            System.out.println("I stay home and practice Java");
        }
    }
}
