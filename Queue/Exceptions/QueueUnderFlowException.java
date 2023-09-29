package Queue.Exceptions;

public class QueueUnderFlowException extends Exception {
    public QueueUnderFlowException() {
        super("Queue Underflow");
    }

    public QueueUnderFlowException(String message) {
        super(message);
    } 
}
