package CollectionFrameworks;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args){
        TreeMap<Integer,String>map=new TreeMap<>();

        map.put(3,"c");t
        map.put(1,"a");
        map.put(2,"b");
        map.put(4,"d");
        map.put(5,"e");

        System.out.println(map);

        //get()
        System.out.println(map.get(2));//give me the val stored at 2

        //firstkey()-->Smallest key
        System.out.println(map.firstKey());

        //lastkey()-->largest key
        System.out.println(map.lastKey());

        //remove()
        map.remove(2);
        System.out.println(map);
    }
}
/**
 * stores the elements in key and value pair
 * key must be unique
 * Automatically sorts the keys
 * uses hash internally
 * users tree structure
 * slower than hashmap
 */
