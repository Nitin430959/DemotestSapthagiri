package OOPS.Basics.ClassWithAttributes;

public class Student {
    String name;
    int usn;
    Student(String name, int usn){ // parameterized constructor
        this.name = name;
        this.usn = usn;
    }
    void printDetails(){
        System.out.println("Student name is"+name);
        System.out.println("Student usn is"+usn);
    }
    public static void main(String[] args){
        Student s1 = new Student("nitin",80);// object creation
        s1.printDetails();
    }
}

