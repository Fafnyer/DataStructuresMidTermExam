package Queue.Exceptions;

public class QueueOverFlowException extends Exception {
    public QueueOverFlowException() {
        super("Queue Overflow");
    }

    public QueueOverFlowException(String message) {
        super(message);
    }
}