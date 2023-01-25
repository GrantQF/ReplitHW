package Homework;

import java.util.Scanner;

public class HW_044 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Input a number between 1-12");
            String car = input.next();
            switch (car) {
                case "BMW":
                    System.out.println("Your favorite car is german car");
                    break;
                case "Toyota":
                    System.out.println("Your favorite car is japanese car");
                    break;
                case "Maserati":
                    System.out.println("Your favorite car is italian car");
                    break;
                default:
                    System.out.println("Your favorite car is unknown");
                    break;
            }
        }
}
