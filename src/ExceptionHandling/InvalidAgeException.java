package ExceptionHandling;

// custom runtimeException

public class InvalidAgeException extends RuntimeException{
    InvalidAgeException(String msg){
        super(msg);
    }
}
class Driver {
    static void main(String[] args) {
        int age = 21;
        if (age > 18) {
            throw new InvalidAgeException("Allow to vote");
        }
        System.out.println("Not Allow to vote");
    }
}

