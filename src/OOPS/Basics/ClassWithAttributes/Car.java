package OOPS.Basics.ClassWithAttributes;

public class Car {
    String Colour;
    String Model;
    Car(String Colour, String Model){
        this.Colour = Colour;
        this.Model = Model;
    }
    void printDetails(){
        System.out.println("Car Colour is"+Colour);
        System.out.println("Car Model is"+Model);
    }
    public static void main(String[] args){
        Car c1 = new Car("Black","A");
        Car c2 = new Car("Red","B");
        Car c3 = new Car("White","C");
        c1.printDetails();
        c2.printDetails();
        c3.printDetails();
    }
}

