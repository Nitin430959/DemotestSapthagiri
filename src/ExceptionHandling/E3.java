package ExceptionHandling;

public class E3 {
    static void checkage(int age) {
        if (age >= 18) {
            System.out.println("Access granted");
        } else {
            throw new RuntimeException("Access denied");
        }
    }
    public static void main(String[] args) {
        checkage(12);

        }
    }
