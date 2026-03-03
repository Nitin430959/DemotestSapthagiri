package OOPS.Inharitance.Multiple;

public class Colour {// parent class(grandparent class)
    void black(){
        System.out.println("blacking");
    }
}
class orange extends Colour{// child class(parent)
    void orange(){
        System.out.println("nice");
    }
}
class white extends orange{//child class
    void white(){
        System.out.println("good");
    }
}
class Driver{
    public static void main(String[] args){
        Colour b = new Colour();
        b.black();

        orange o = new orange();
        o.orange();

        white w = new white();
        w.white();
    }
}
