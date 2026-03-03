package conditionalstatements;

public class NestedIfElseExample {
    static void main() {
        int a = 20;
        if(a>18){
            if(a<19){
                System.out.println("Apple");
            }
            else{
                System.out.println("banana");
            }
        }else{
            System.out.println("orange");
        }
    }
}
