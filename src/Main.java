public class Main {

    public static void main(String[] args) {
        int[] sizes = {10, 50, 100, 500, 1000, 2000, 4000, 8000, 10000, 16000}; 
        
        System.out.println("--- Sorting Algorithm Experiment ---");
        System.out.println("Comparing Bubble Sort vs. Insertion Sort on a Linked List");
        System.out.println("Times in milliseconds (ms)\n");
        System.out.println("| Data Size | Bubble Sort Time (ms) | Insertion Sort Time (ms) |");
        System.out.println("|-----------|-----------------------|--------------------------|");

        for (int i = 0; i < sizes.length; i++) {
            int size = sizes[i];
            LinkedList originalList = createRandomList(size);
            
            // Bubble Sort Test
            LinkedList listForBubble = copyList(originalList);
            BubbleSort bubbleSorter = new BubbleSort(listForBubble);
            
            long startTimeBubble = System.nanoTime();
            bubbleSorter.bubbleSort(); 
            long endTimeBubble = System.nanoTime();
            long durationBubble = (endTimeBubble - startTimeBubble) / 1000000;

            // Insertion Sort Test
            LinkedList listForInsertion = copyList(originalList);
            InsertionSort insertionSorter = new InsertionSort(listForInsertion);
            
            long startTimeInsertion = System.nanoTime();
            insertionSorter.insertionSort(); 
            long endTimeInsertion = System.nanoTime();
            long durationInsertion = (endTimeInsertion - startTimeInsertion) / 1000000;

            String line = "| " + size;
            for(int j=0; j < (9 - (""+size).length()); j++) line += " "; 
            
            line += " | " + durationBubble;
            for(int j=0; j < (21 - (""+durationBubble).length()); j++) line += " "; 

            line += " | " + durationInsertion;
            for(int j=0; j < (24 - (""+durationInsertion).length()); j++) line += " "; 
            
            System.out.println(line + " |");
        }
    }

    public static LinkedList createRandomList(int size) {
        LinkedList list = new LinkedList();
        for (int i = 0; i < size; i++) {
            int randomValue = (int)(Math.random() * 10000); 
            list.add(randomValue);
        }
        return list;
    }

    public static LinkedList copyList(LinkedList original) {
        LinkedList copy = new LinkedList();
        Node current = original.getHead();
        while (current != null) {
            copy.add(current.getElement()); 
            current = current.getNext();
        }
        return copy;
    }
}

