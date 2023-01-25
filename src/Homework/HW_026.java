package Homework;

import java.util.Scanner;

public class HW_026 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name= input.nextLine();
        if(name.equalsIgnoreCase("Chen")){
            System.out.println("teacher");
        }else {
            System.out.println("student");
        }
    }
}
