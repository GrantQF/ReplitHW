package Homework;

import java.util.Scanner;

public class HW_022 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name");
        String name= input.nextLine();
        System.out.println("Enter your mobile number");
        String pnumber= input.nextLine();
        System.out.println("Enter your age");
        int age= input.nextInt();
        System.out.println("Your name is "+name+", your age is "+age+" and your mobile number is "+pnumber);

    }
}
