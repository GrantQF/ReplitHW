package Homework;

import java.util.Scanner;

public class HW_065 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int a=(x-1);
        for (int i = a; i >=0; i--) {
            System.out.print(i + " ");
        }
    }
}