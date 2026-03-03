package OOPS.Polymorphism.RunTime;

public class Mom {
    void cook(){
        System.out.println("Indian");
    }
}
class Son extends Mom{
    void cook(){
        System.out.println("chinese");
    }
}
class Baby extends Son{
    void cook(){
        System.out.println("Rajastani");
    }
}
class Driver{
    public static void main(String[] args){
        Mom m = new Mom();
        m.cook();
        Son s = new Son();
        s.cook();
        Baby b=new Baby();
        b.cook();

    }

}
