package Homework;

public class HW_069_3 {
    public static void main(String[] args) {
        for (int i = 0; i <= 7; i++) {
            for (int j = 1; j <= 7 - i; j++) {
                System.out.print(j + " ");
            }
            if (i != 7)
                System.out.println("");

        }
        for (int i = 2; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        System.out.println("*******************************************");
        /* int x=2;
        int y=i;


*/
        for (int i = 8; i >= 2; i--) {
            for (int j = 7; j > i; j--) {
                System.out.print(j + " ");
            } if (i != 2)
                System.out.println("");



        }
    }
}
