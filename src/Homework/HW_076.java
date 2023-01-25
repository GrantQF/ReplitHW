package Homework;

import java.util.Scanner;

public class HW_076 {
    public static void main(String[] args) {
        String[] arr=new String[7];
        Scanner input=new Scanner(System.in);
        for (int i=0;i< arr.length;i++){
            System.out.println("Please enter "+(i+1)+" day of the week");
            arr[i]= input.nextLine();
        }for (int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
