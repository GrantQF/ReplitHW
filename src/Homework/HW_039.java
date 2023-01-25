package Homework;

import java.util.Scanner;

public class HW_039 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your mark");
        int mark = input.nextInt();
        if(mark>0&&mark<25){
            System.out.println("Your grade is F");
        } else if (mark>25&&mark<45) {
            System.out.println("Your grande is E");
        } else if (mark>45&&mark<50) {
            System.out.println("Your grande is D");
        } else if (mark>50&&mark<60) {
            System.out.println("Your grande is C");
        } else if (mark>60&&mark<80) {
            System.out.println("Your grande is B");
        } else if (mark>80) {
            System.out.println("Your grande is A");
        }else {
            System.out.println("Please enter valid mark");
        }
    }
}
