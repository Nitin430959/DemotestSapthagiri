package Recursion;

public class RecDemo {
    static void function(int x) {
        if (x < 5) {//--------------->base case
            System.out.println("Hello..");
            function(x + 1);//------------->recursive case


        }
    }
    public static void main(String[] args){
        function(0);


    }
}
