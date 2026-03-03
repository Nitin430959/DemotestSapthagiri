package OOPS.Inharitance.Single;

public class Animal {
    void eat(){
        System.out.println("Eating");
    }
}
class Dog{
    void bark(){
        System.out.println("barking");
    }
}
class Driver{
    public static void main(String[] args){
        Animal a = new Animal();
        a.eat();

        Dog d = new Dog();
        d.bark();
    }
}
