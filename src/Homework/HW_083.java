package Homework;

public class HW_083 {
    public static void main(String[] args) {
        int[][] a = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };
        int[] asum=new int[4];
        for (int i=0;i<a.length;i++){
            int sum=0;
            for (int j=0;j<a[i].length;j++){
                if(i==0){
                    sum=sum+a[i][j];
                    asum[i]=sum;
                }else if(i==1){
                    sum=sum+a[i][j];
                    asum[i]=sum;
                }else if(i==2){
                    sum=sum+a[i][j];
                    asum[i]=sum;
                }else if(i==3){
                    sum=sum+a[i][j];
                    asum[i]=sum;
                }
            }
        }for (int sumarr:asum)
        System.out.println(sumarr);
    }
}
