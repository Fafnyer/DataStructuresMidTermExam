package Ch2Stack;

import Ch2Exceptions.StackOverflowException;
import Ch2Exceptions.StackUnderflowException;

public interface StackInterface<T> {
    void push(T element) throws StackOverflowException;
    void pop() throws StackUnderflowException;
    T top() throws StackUnderflowException;
    
    boolean isFull();
    boolean isEmpty();
}
