package Homework;

public class HW_087 {
    public static void main(String[] args) {
        Main hw=new Main();
        hw.carColor="Black";
        hw.carYear=2019;
        hw.carMake="BMW";
        System.out.println("Car color is "+hw.carColor+" and car year is "+hw.carYear+" and car model is "+hw.carMake);
        hw.carColor="White";
        hw.carYear=2018;
        hw.carMake="Toyota";
        System.out.println("Car color is "+hw.carColor+" and car year is "+hw.carYear+" and car model is "+hw.carMake);
    }


}
