package Module6;


public class MyLinkedList<T> {
    Node<T> first;
    Node<T> last;
    int size;


    public MyLinkedList(){
        first = new Node<T>(null, null, null);
        last = first;
        size = 0;
    }

    public void add(T item) {
        Node<T> node = new Node<>(item, null, last);
        last.next = node;
        last = node;
        size++;
    }

    public void show() {
        Node<T> iterator = first;
        if (iterator == null) return;

        do {
            System.out.print("" + iterator.item + " ");
            iterator = iterator.next;
        } while (iterator != null);
        System.out.println();
    }

    public int size(){
        return size;
    }

    public void remove(T item){
        Node<T> currentNode = first;
        Node<T> previousNode = null;
        while(currentNode != null){
            if(item.equals(currentNode.item)){
                if(previousNode  == null) {
                    first = currentNode.next;
                }
                else {
                    previousNode.next = currentNode.next;
                }
                size--;
            }
            else {
                previousNode = currentNode;
            }
            currentNode = currentNode.next;
        }

    }

    public Node<T> getNode(int index){
        Node<T> iterator = first;
        if (iterator == null) return null;
        for (int i = 0; i < index; i++){
            iterator = iterator.next;
        }
        return iterator;
    }

    public T get(int index){
        return getNode(index).item;
    }


}
