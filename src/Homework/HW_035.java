package Homework;

import java.util.Scanner;

public class HW_035 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Do you need a loan");
        boolean loan= input.nextBoolean();
        if(loan) {
            System.out.println("What is your credit score?");
            int cs = input.nextInt();
            if (cs < 600) {
                System.out.println("The eligibility is Not eligible");
            } if (cs > 599 && cs < 701) {
                System.out.println("The eligibility is Maybe eligible");
            } if (cs > 700 && cs < 801) {
                System.out.println("The eligibility is Eligible");
            } if (cs >800){
                System.out.println("The eligibility is Definitely eligible");
            }
        }if(!loan){
            System.out.println("Unknown");
        }

    }
}
