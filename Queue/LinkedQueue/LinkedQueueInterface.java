package Queue.LinkedQueue;

public interface LinkedQueueInterface <T> {
    public void enqueue(Node<T> element);

    public Node dequeue();

    public boolean isEmpty();

    public boolean isFull();

    public int size();
}
