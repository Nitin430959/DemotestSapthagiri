package LoopingStastements.Patterprinting;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        for (int i = 1; i <=size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
             for (int k =2*i; k <=2*size; k++) {
                 System.out.print(" ");
             }
             for (int j = 1; j <=i; i++) {
                 System.out.print("*");
             }
            System.out.println();
        }
    }
}
