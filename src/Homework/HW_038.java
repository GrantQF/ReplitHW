package Homework;

import java.util.Scanner;

public class HW_038 {
    public static void main(String[] args) {
        System.out.println("Is it the weekend?");
        Scanner input=new Scanner(System.in);
        boolean weekend= input.nextBoolean();
        if(weekend){
            System.out.println("Today you will be learning Java");
        }else {
            System.out.println("Today you will be learning manual testing");
        }
    }
}
