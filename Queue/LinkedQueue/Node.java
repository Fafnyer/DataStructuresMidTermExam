package Queue.LinkedQueue;

public class Node<T> {
     
    private T info;
    private Node<T> link;

    public Node(T info) {
        this.info = info;
        link = null;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public T getInfo() {
        return info;
    }

    public void setLink(Node<T> link) {
        this.link = link;
    }

    public Node<T> getLink() {
        return link;
    }
}