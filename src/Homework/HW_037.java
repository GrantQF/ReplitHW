package Homework;

import java.util.Scanner;

public class HW_037 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Are you thirsty?");
        boolean thristy= input.nextBoolean();
        System.out.println("Are you sleepy?");
        boolean sleepy=input.nextBoolean();
        if(thristy&&!sleepy){
            System.out.println("Looks like you need to drink water");
        }if (thristy&&sleepy) {
            System.out.println("Looks like you need to drink coffee");
        }if (!thristy&&sleepy) {
            System.out.println("Looks like you need to drink tea");
        }else {
            System.out.println("Looks like you need to drink nothing");
        }

    }
}
