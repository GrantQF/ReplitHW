package Homework;

import java.util.Scanner;

public class HW_034 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter 3 distinct numbers");
        int number1= input.nextInt();
        int number2= input.nextInt();
        int number3= input.nextInt();
        if(number1>number2){
            if (number1>number3) {
                System.out.println("The largest number is " + number1);
            }
        }else if (number2>number1) {
            if (number2 > number3) {
                System.out.println("The largest number is " + number2);
            }
        }else if (number3>number1) {
            if(number3>number2){
                System.out.println("The largest number is "+number3);
            }
        }
    }
}
