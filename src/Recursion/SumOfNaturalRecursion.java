package Recursion;

public class SumOfNaturalRecursion {
    static int sum(int x) {
        if (x == 1) {
            return 1;//base case

        } else {
            return x + sum(x -1); //recursive case
        }
    }

    public static void main(String[] args){
        int num =5;
        int result = sum(num);
        System.out.println(result);
    }


}
