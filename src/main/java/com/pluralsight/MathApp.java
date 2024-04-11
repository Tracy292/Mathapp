package com.pluralsight;

public class MathApp {
    public static void main(String[] ars){
       int Garyssalary = 300000;
       int bobssalary = 20000;
       int highestsalary = Math.max(Garyssalary,bobssalary);
        System.out.println("Highest Salary is.." + highestsalary);
    //question 2
        int Carprice = 5000000;
        int Truckprice = 6000000;
        int Lowestprice =Math.min(Carprice,Truckprice);
         System.out.println("Lowest Price is.."+ Lowestprice);
         // question 3
        double Radius = 7.25;
        double area = Math.PI*Math.pow(Radius,2);
       System.out.println("Area is.."+ area);
    }
}
