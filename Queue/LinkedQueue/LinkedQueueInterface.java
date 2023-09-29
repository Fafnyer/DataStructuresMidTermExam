package Queue.LinkedQueue;

import Queue.Exceptions.QueueOverFlowException;
import Queue.Exceptions.QueueUnderFlowException;

public interface LinkedQueueInterface<T> {

    void enqueue(T info) throws QueueOverFlowException;
    T dequeue() throws QueueUnderFlowException;

    boolean isEmpty();
    boolean isFull();
    int size();
}
