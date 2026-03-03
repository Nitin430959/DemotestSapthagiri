package Basics;

import java.util.Scanner;

public class studentgradingsystem {
    static void main() {
        int sub1, sub2, sub3, sub4, sub5, total;
        float percentage;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sub1 markes:");
        sub1 = sc.nextInt();
        System.out.println("Enter the sub2 markes:");
        sub2 = sc.nextInt();
        System.out.println("Enter the sub3 markes:");
        sub3 = sc.nextInt();
        System.out.println("Enter the sub4 markes:");
        sub4 = sc.nextInt();
        System.out.println("Enter the sub5 markes:");
        sub5 = sc.nextInt();

        total= sub1 + sub2 + sub3 + sub4 + sub5;
        percentage = (total/ 500) * 100;

        if (percentage >= 98) {
            System.out.println("grade A");
        } else if (percentage >= 85) {
            System.out.println("grade B");
        } else if(percentage >=89){
            System.out.println("grade C");
        }else{
            System.out.println("fail");
        }


    }
}
