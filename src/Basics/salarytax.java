package Basics;

import java.util.Scanner;

public class salarytax {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary:");
        double sal = sc.nextDouble();
        double tax = 0;
        double netsalary;

        if(sal < 300000){
            tax = 0;
        }else{
            if(sal < 700000){
                tax = sal * 0.10;
            }else{
                tax = sal * 0.20;
            }
        }
        netsalary = sal - tax;
        System.out.println("Tax Amount "+ tax);
        System.out.println("Net salary" + netsalary);


    }



}
