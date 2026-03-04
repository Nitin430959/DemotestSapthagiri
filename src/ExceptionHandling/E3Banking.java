package ExceptionHandling;

public class E3Banking {
    public static void main(String[] args) {
        try {
            int balance = 5000;
            int withdraw = 3000;
            if (withdraw > balance) {
                throw new ArithmeticException("Insufficient");
            }
            System.out.println("withdraw successful");
        } catch (ArithmeticException e) {
            System.out.println("Exception Caught:" + e.getMessage());
        }
    }
}

