public class BubbleSort {
    private LinkedList list;

    public BubbleSort(LinkedList list) {
        this.list = list;
    }

    public void bubbleSort() {
        int n = this.list.size();
        boolean b = false; 

        while ((n > 0) && (!b)) {
            Node current = list.getHead();
            int i = 1;
            b = true;

            while (i < n) {
                if (current != null && current.getNext() != null) {
                    if (this.compare(current, current.getNext())) {
                        this.swap(current, current.getNext());
                        b = false; 
                    }
                    current = current.getNext();
                } else if (current == null) {
                    break; 
                }
                i++;
            }
            n--;
        }
    }

    private boolean compare(Node a, Node b) {
        if (b == null) {
            return false; 
        }
        int ia = (int) a.getElement(); 
        int ib = (int) b.getElement();
    
        return (ia > ib);
    }

    private void swap(Node a, Node b) {
        Object t = a.getElement();
        a.setElement(b.getElement());
        b.setElement(t);
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