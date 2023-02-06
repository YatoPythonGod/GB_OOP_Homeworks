package Task_5.Exceptions;

public class BadPhoneNumberException extends Exception{
    public BadPhoneNumberException(){
        super("You entered an incorrect phone number");
    }
}
