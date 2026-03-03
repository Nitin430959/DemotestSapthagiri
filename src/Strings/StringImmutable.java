package Strings;

public class StringImmutable {
    public static void main(String[] args){
        String s1="Nitin";
        s1.concat("Ramesh");
        String s2= s1.concat("Ramesh");
        System.out.println(s1);
        System.out.println(s2);
    }
}
//if we want to add new string to the s1, we have to create new string like s2 then only you get both strings
//togatherly how like,to put whatever you want in s2 string then you give print() you get o/p

