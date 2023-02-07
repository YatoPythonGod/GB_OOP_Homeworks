package Task_6.Exceptions;

public class BadEmailException extends Exception{

    public BadEmailException(){
        super("You entered an incorrect email");
    }
}
