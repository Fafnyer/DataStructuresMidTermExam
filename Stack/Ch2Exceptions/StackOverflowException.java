package Ch2Exceptions;

public class StackOverflowException extends Exception{ 

    public StackOverflowException() {
        super("StackOverFlowException");
    }

    public StackOverflowException(String message) {
        super(message);
    }

}


    