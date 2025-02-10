package collections;
import java.util.*;

/**
 *
 * @author User
 */
class MyCom implements Comparator<Integer> {
    public int compare(Integer o1, Integer o2) {  // Updated variable names
        if (o1 < o2)
            return 1;
        if (o1 > o2)
            return -1;
        return 0;
    }
}

public class priorityQueue{  // Updated class name

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a PriorityQueue with the custom comparator
        PriorityQueue<Integer> pq = new PriorityQueue<>(new MyCom());
        
        // Adding elements to the priority queue
        pq.add(20);
        pq.add(10);
        pq.add(30);
        pq.add(5);
        pq.add(15);
        pq.add(35);
        
        // Print elements in the priority queue
        pq.forEach((n) -> System.out.println(n));
    }
}
