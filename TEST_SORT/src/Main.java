public class Main {

    public static void main(String[] args) {
        int size = 10; 
        
        System.out.println("---Test Algoritma Sorting---");
        System.out.println("Ukuran Data: " + size);
        
        LinkedList originalList = createRandomList(size);
        System.out.print("\nList Sebelum Dilakukan Sorting: ");
        BubbleSort originalPrinter = new BubbleSort(originalList); 
        originalPrinter.printList();

        LinkedList listForBubble = originalList.copy();
        BubbleSort bubbleSorter = new BubbleSort(listForBubble);
        
        bubbleSorter.bubbleSort(); 
        
        System.out.print("Hasil Bubble Sort: ");
        bubbleSorter.printList(); 

        LinkedList listForInsertion = originalList.copy();
        InsertionSort insertionSorter = new InsertionSort(listForInsertion);
        
        insertionSorter.insertionSort(); 
        
        System.out.print("Hasil Insertion Sort: ");
        insertionSorter.printList(); 
    }

    public static LinkedList createRandomList(int size) {
        LinkedList list = new LinkedList();
        for (int i = 0; i < size; i++) {
            int randomValue = (int)(Math.random() * 10000); 
            list.add(randomValue);
        }
        return list;
    }
}