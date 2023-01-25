package Homework;

import java.util.Objects;
import java.util.Scanner;

public class HW_036 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter two strings");
        String word1= input.nextLine();
        String word2= input.nextLine();
        System.out.println("Please enter two numbers");
        int num1= input.nextInt();
        int num2= input.nextInt();
        if((num1==num2)&&(Objects.equals(word1, word2))) {
            System.out.println("AND");
        }else if ((num1==num2)||(Objects.equals(word1, word2))){
            System.out.println("OR");
        }else if((num1!=num2)&&(word1!=word2)){
            System.out.println("NONE");
        }
    }
}
