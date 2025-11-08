public class InsertionSort {
    private LinkedList list;

    public InsertionSort(LinkedList list) {
        this.list = list;
    }

    public void insertionSort() {
        if (list.getHead() == null || list.getHead().getNext() == null) return;

        Node sorted = null; 
        Node current = list.getHead();

        while (current != null) {
            Node next = current.getNext(); 
            sorted = insertInOrder(sorted, current); 
            current = next; 
        }

        list.setHead(sorted); 
    }

    private Node insertInOrder(Node head, Node newNode) {
        if (head == null || (int)newNode.getElement() < (int)head.getElement()) {
            newNode.setNext(head);
            return newNode;
        }

        Node current = head;
        while (current.getNext() != null && (int)current.getNext().getElement() < (int)newNode.getElement()) {
            current = current.getNext();
        }

        newNode.setNext(current.getNext());
        current.setNext(newNode);
        return head;
    }

    public void printList() {
        Node current = list.getHead();
        System.out.print("[");
        while (current != null) {
            System.out.print(current.getElement());
            if (current.getNext() != null) System.out.print(", ");
            current = current.getNext();
        }
        System.out.println("]");
    }
}
