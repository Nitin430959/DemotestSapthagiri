package OOPS.Inharitance.Hierrachial;

public class Animal {
    void eat(){
        System.out.println("eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("barking");
    }
}
class Cat extends Animal{
    void Meow(){
        System.out.println("Meow");
    }
}
class Driver {
    public static void main(String[] args) {
        Animal e = new Animal();
        e.eat();
        Dog d = new Dog();
        d.bark();
        e.eat();
        Cat c = new Cat();
        c.Meow();
        d.bark();
        e.eat();
    }
}

