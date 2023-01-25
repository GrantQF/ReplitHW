package Homework;

public class HW_081 {
    public static void main(String[] args) {
        int[] a={5,4,8};
        int high=0;
        for (int i=0;i<a.length;i++){
            if(a[i]>high){
                high=a[i];
            }
        }System.out.println(high);
    }
}
