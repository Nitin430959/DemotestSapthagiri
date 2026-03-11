package CollectionFrameworks;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);
        System.out.println(set);

        //contains()
        System.out.println("Contains 20?"+set.contains(20));

        //remove()
        set.remove(10);
        System.out.println(set);

        //size
        System.out.println(set.size());

    }
}


