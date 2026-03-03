package OOPS.Inharitance.ClassesWithConstractor;

public class Person {
    String FirstName;
    String LastName;

    Person(String FirstName,String LastName){
        this.FirstName=FirstName;
        this.LastName=LastName;
    }
}
class Student extends Person{
    int usn;
    Student(int usn,String FirstName,String LastName){
        super(FirstName,LastName);
        this.usn=usn;
    }
}
class Driver {
    public static void main(String[] args) {
        Student s1 = new Student(80, "Nitin", "Duradundi");
        System.out.println("PersonName"+"Nitin");
        System.out.println("PersonLastName"+"Duradundi");
        System.out.println("usn"+80);
    }
}
