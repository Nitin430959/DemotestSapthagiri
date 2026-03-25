package Recursion.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class ArraySubset {
    static void ArraySubsets(int[] arr, int index, List<Integer> current) {
        // base case

        if (index == arr.length) {
            System.out.println(current);
            return;
        }
        // adding the elements

        current.add(arr[index]);
        ArraySubsets(arr,index+1,current);

        //BackTracking
        current.remove(current.size()-1);
        //skip and explore
        ArraySubsets(arr,index+1,current);
    }
        public static void main(String[] args){
        int[] arr={1,2,3};
        int index=0;
        ArraySubsets(arr,index,new ArrayList<>());
        }
    }

