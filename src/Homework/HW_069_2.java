package Homework;

public class HW_069_2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 7; i++) {
            for (int j = 1; j <= 7 - i; j++) {
                System.out.print(j+" ");
            }if (i != 7)
            System.out.println("");

        }
        for (int i = 2; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}
