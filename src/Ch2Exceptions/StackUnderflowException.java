package Ch2Exceptions;

public class StackUnderflowException extends Exception {
    public StackUnderflowException() {
        super("StackUnderflowException");
        setStackTrace(getStackTrace());
    }
    
    public StackUnderflowException(String message) {
        super(message);
    }
}
