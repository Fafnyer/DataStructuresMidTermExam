package Queue.LinkedQueue;

import Queue.Exceptions.QueueOverFlowException;
import Queue.Exceptions.QueueUnderFlowException;

public class LinkedQueue <T> implements LinkedQueueInterface<T> {

    private Node <T> top;
    int size;

    public LinkedQueue () {
        top = null;
        size = 0;
    }

    @Override
    public void enqueue(T info) throws QueueOverFlowException {
        Node <T> newNode = new Node<T>(info);
        if(size == 0) {
            top = newNode;
            size++;
        } else {
            Node<T> currentNode = top;
            while(currentNode.getLink() != null) {
                currentNode = currentNode.getLink();
            }
            currentNode.setLink(newNode);
            size++;
        }   
    }

    @Override
    public T dequeue() throws QueueUnderFlowException{
        if (isEmpty()) {
            throw new QueueUnderFlowException("Dequeue Attepted on empty queue");
        }
        Node<T> removedNode = top;
        top = top.getLink();
        size--;
        return removedNode.getInfo();
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int size() {
        return size;
    }
    
}
