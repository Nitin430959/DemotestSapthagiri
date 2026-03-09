package Arrays;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50}; //->10,20,30,40,50
        int[] arr2 = new int[5]; // 0,0,0,0,0
        System.out.println(arr1[1]);//20

        //      System.out.println(arr1); //Wrong way
        // printin arr1
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " "); // 10,20,30,40,50
        }
        System.out.println();

        //printing arr2
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");//10,20,30,40,50
        }
    }
}

