package OOPS.Abstraction.Partial.Complete100.MultipleInheritance;

public interface Mom {
    void cook();
}
interface Dad{
    void cook();
}
class Child implements Mom,Dad{
    public void cook(){
        System.out.println("Indian");
    }
}
class Driver{
    public static void main(String[] args) {
        Child c= new Child();
        c.cook();
    }
}
