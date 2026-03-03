package OOPS.Inharitance.Multiple_;

public class Mom {
    void wash(){
        System.out.println("washing");
    }
}
class Child extends Mom{// in java doesnt support multiple inheritance
    void play(){
        System.out.println("playing");
    }
}
class nitin{
public static void main(String[] args){
    Mom m = new Mom();
    m.wash();
    Child c = new Child();
    c.play();
    m.wash();

}
}
