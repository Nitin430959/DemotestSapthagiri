package OOPS.Abstraction.Partial;

abstract class Animal {
    abstract void eat();

    void run(){
        System.out.println("Running");
    }

}
class Lion extends Animal{
    void eat(){
        System.out.println("Meat");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Grass");
    }
}
class Driver{
    public static void main(String[] args){
        Lion l = new Lion();
        l.eat();
        Deer d = new Deer();
        d.eat();
    }
}
// here we not use Animal as object creation bcz we cannot creat object of hidding class(Abstraction)