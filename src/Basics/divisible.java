package Basics;

import java.util.Scanner;

public class divisible {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if(n%3==0 && n%7==0){
            System.out.println("num divisible by both 3 & 7");
        }else
            System.out.println("num divisible by both 3 & 7");
    }
}
