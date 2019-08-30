package nadiatests;

import java.util.Comparator;
import java.util.PriorityQueue;
// http://www.programcreek.com/2009/02/using-the-priorityqueue-class-example/

public class PriorityQueueExample3 { //GOOD
    static class PQsort implements Comparator<Integer> {
        public int compare(Integer one, Integer two) {
            return two - one;
        }
    }
    public static void main(String[] args) {
        int[] ia = { 1, 10, 5, 3, 4, 7, 6, 9, 8 };
        PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
        // use offer() method to add elements to the PriorityQueue pq1
        //when element can not be added to collection, the add method throws an exception and offer doesn't
        for (int x : ia) {
            pq1.offer(x);
        }
        System.out.println("pq1: " + pq1);
        PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>(10, new PQsort());  //GOOD GOOD
        // In this particular case, we can simply use Collections.reverseOrder()
        // instead of self-defined comparator
        for (int x : ia) {
            pq2.offer(x);
        }

        System.out.println("pq2: " + pq2);

        // print size
        System.out.println("size: " + pq2.size());
        // return highest priority element in the queue without removing it
        System.out.println("peek: " + pq2.peek());
        // print size
        System.out.println("size: " + pq2.size());
        // return highest priority element and removes it from the queue
        System.out.println("poll: " + pq2.poll());
        // print size
        System.out.println("size: " + pq2.size());

        System.out.print("pq2: " + pq2);

    }
}

