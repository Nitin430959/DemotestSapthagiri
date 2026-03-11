package CollectionFrameworks;

import java.util.ArrayList;

public class ArrayListDEmo {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        //  add()
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        System.out.println("ArrayList:"+list);

        //get()
        System.out.println("Element at index 1 is: "+list.get(1));

        //Size()
        System.out.println("Size:"+list.size());

        //contains()
        System.out.println("Contains 30?:"+list.contains(30));

        //remove()
        list.remove(2);
        System.out.println("After removing index 2: "+list);
    }
}

/**
 *maintains the insertion order
 * Allows Duplicates
 * Dynamic in size
 * index based access
 * reading elements is faster
 */