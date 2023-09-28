package Ch2Stack;

import Ch2Exceptions.StackOverflowException;
import Ch2Exceptions.StackUnderflowException;

public class ArrayBoundedStack<T> implements StackInterface<T> {

    protected final int DEFCAP = 100;
    protected T[] elements;
    protected int topIndex;

    public ArrayBoundedStack() {
        elements = (T[]) new Object[DEFCAP];
        topIndex = -1;
    }

    public ArrayBoundedStack(int cap) {
        elements = (T[]) new Object[cap];
        topIndex = -1;
    }

    @Override
    public void push(T element) throws StackOverflowException {
        if(isFull())  {
            throw new StackOverflowException("Stack is full");
        } else {
            topIndex++;
            elements[topIndex] = element;
        }
    }

    @Override
    public void pop() throws StackUnderflowException{
        if(isEmpty()) {
           throw new StackUnderflowException("Stack is empty");
        } else {
            elements[topIndex] = null;
            topIndex--;
        }
    }

    @Override
    public T top() throws StackUnderflowException{
        if(isEmpty()) {
            throw new StackUnderflowException("Stack is empty");    
        }
        return elements[topIndex];
    }

    @Override
    public boolean isFull() {
        return (topIndex == elements.length - 1);
    }

    @Override
    public boolean isEmpty() {
        return (topIndex == -1);
    }
    
}
