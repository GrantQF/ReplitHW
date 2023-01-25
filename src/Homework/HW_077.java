package Homework;

import java.util.Scanner;

public class HW_077 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i< arr.length;i++){
            arr[i]= input.nextInt();
        }for (int i=5;i>=1;i--)
            System.out.println(i);
    }
}
