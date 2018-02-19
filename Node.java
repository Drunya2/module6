package Module6;

public class Node<T>  {
    public T item;
    public Node<T> next;
    public Node<T> prev;
    private int payload;

    public Node(T item, Node<T> next, Node<T> prev) {
        this.item = item;
        this.next = next;
        this.prev = prev;
    }
    public Node getNextNode() {
        return next;
    }

    public Node getPrevNode() {
        return prev;
    }

    public void setNextNode(Node n) {
        next = n;
    }

    public void setPrevNode(Node n) {
        prev = n;
    }

    public int getPayload() {
        return payload;
    }
}
