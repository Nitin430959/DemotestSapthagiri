package CollectionFrameworks;

import java.sql.SQLOutput;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();

        //add()
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);

        //addfirst()
        list.addFirst("start");
        System.out.println(list);

        //addLast
        list.addLast("End");
        System.out.println(list);
        //get()
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        //remove()
        list.removeFirst();
        System.out.println(list);
    }
}
/**
 *maintains the insertion order
 *Allows duplicates
 *uses Node structure internally
 *Faster insertion and deletion than Arrylist
 *slow reading
 * */