public class InsertionSort {
    private LinkedList list;

    public InsertionSort(LinkedList list) {
        this.list = list;
    }

    public void insertionSort() {
        if (this.list == null || this.list.getHead() == null) {
            return;
        }
        LinkedList sortedList = new LinkedList();
        Node current = this.list.getHead();
        while (current != null) {
  
            Node next = current.getNext();
            current.setNext(null);
            sortedList = this.insertNode(sortedList, current);
            current = next;
        }
        this.list = sortedList;
    }

    private LinkedList insertNode(LinkedList sortedList, Node newNode) {

        if (sortedList.getHead() == null) {
            sortedList.setHead(newNode);
            return sortedList;
        }

        Node head = sortedList.getHead();
        if (isGreater(head, newNode)) {
            newNode.setNext(head);
            sortedList.setHead(newNode);
            return sortedList;
        }
        Node current = head;
        while (current.getNext() != null && isGreater(newNode, current.getNext())) {
            current = current.getNext();
        }

        newNode.setNext(current.getNext());
        current.setNext(newNode);
        return sortedList;
    }

    private boolean isGreater(Node a, Node b) {
        if (a == null) return false;
        if (b == null) return true; 
        
        int ia = (int) a.getElement();
        int ib = (int) b.getElement();
        return (ia > ib);
    }

    public void printList() {
        Node current = this.list.getHead();
        System.out.print("[");
        while (current != null) {
            System.out.print(current.getElement());
            if (current.getNext() != null) {
                System.out.print(", ");
            }
            current = current.getNext();
        }
        System.out.println("]");
    }
}