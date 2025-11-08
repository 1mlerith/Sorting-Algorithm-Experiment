public class BubbleSort {
    private LinkedList list;

    public BubbleSort(LinkedList list) {
        this.list = list;
    }

    public void bubbleSort() {
        if (list.getHead() == null || list.getHead().getNext() == null) return;

        boolean swapped;
        do {
            swapped = false;
            Node prev = null;
            Node current = list.getHead();

            while (current != null && current.getNext() != null) {
                Node next = current.getNext();

                int a = (int) current.getElement();
                int b = (int) next.getElement();

                if (a > b) {
                    // Swap links
                    current.setNext(next.getNext());
                    next.setNext(current);

                    if (prev == null) {
                        list.setHead(next);
                    } else {
                        prev.setNext(next);
                    }

                    // Move prev to next 
                    prev = next;
                    swapped = true;
                } else {
                    prev = current;
                    current = current.getNext();
                }
            }
        } while (swapped);
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
