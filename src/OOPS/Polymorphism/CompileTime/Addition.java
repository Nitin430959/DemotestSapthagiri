package OOPS.Polymorphism.CompileTime;

public class Addition {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
class Driver{
    static void main(String[] args) {
        Addition obj = new Addition();
        System.out.println(obj.add(2,3));
        System.out.println(obj.add(1,2,3));

    }
}

