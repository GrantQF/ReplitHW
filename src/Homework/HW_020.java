package Homework;

import java.util.Scanner;

public class HW_020 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your first name");
        String fname=input.nextLine();
        System.out.println("Please enter your last name");
        String lname=input.nextLine();
        System.out.println(fname+" "+lname);

    }
}
