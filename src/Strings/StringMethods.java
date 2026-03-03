package Strings;

import java.security.PublicKey;

public class StringMethods {
    static void main(String[] args){
        String s1 = "Java Programming";
        String s2 = new String("Java Programming");
        System.out.println("Original String:"+s1);

        //length()
        System.out.println("Length:"+s1.length());

        //charAt()
        System.out.println("Character at index 2:"+s1.charAt(2));

        //toUpper() and toLower()
        System.out.println("UpperCase:"+s1.toUpperCase());
        System.out.println("LowerCase:"+s1.toLowerCase());

        //equals() and ==
        System.out.println("Using =="+(s1==s2));//if mem are same or not
        System.out.println("Using equals():"+s1.equals(s2));

        //compareTo() lexicographical comparison(ASCII) compare
        System.out.println("compareTo():"+s1.compareTo(s2));

        //substring()
        System.out.println("Substring 0 to 4:"+s1.substring(0,4));

        //contain()
        System.out.println("Contains 'Program':"+s1.contains("Program"));

        //indexof()
        System.out.println("Index of 'a':" +s1.indexOf('a'));

        //replace()
        System.out.println("Replace Java to Python:"+s1.replace("Java","Python"));

        // trip()
        String s3="  Hello world";
        System.out.println("Before Trim:"+s3);
        System.out.println("After trim:"+s3.trim());

        //concat()
        System.out.println("Concat:"+s1.concat("Language"));

        //isEmpty()
        String s4="";
        System.out.println("Is Empty:"+s4.isEmpty());

        //split()
        String sentence="Java is a Programming Language";
        String[] arr = sentence.split(" ");

        for(String i : arr){ //for - each loop
            System.out.println(i);
        }
    }
}
