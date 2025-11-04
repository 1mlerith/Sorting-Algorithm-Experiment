public class LinkedList {
    private Node head;
    private int size; 

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void add(Object element) {
        Node newNode = new Node(element);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node current = this.head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        this.size++;
    }

    public Node getHead() {
        return this.head;
    }

    public int size() {
        return this.size;
    }

    public void setHead(Node node) {
        this.head = node;

    }

    public LinkedList copy() {
        LinkedList newList = new LinkedList();
        Node current = this.head; 

        while (current != null) {
            newList.add(current.getElement()); 
            current = current.getNext();
        }
        return newList;
    }  
}