
public class Node {
    private Object element; 
    
    private Node next; 

    public Node(Object element) {
        this.element = element;
        this.next = null;
    }

    public Object getElement() {
        return this.element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
