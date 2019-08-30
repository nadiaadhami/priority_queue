package nadiatests;

// http://www.journaldev.com/1642/java-priority-queue-priorityqueue-example
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class PriorityQueueExample {
    public static void main(String[] args) {
        //natural ordering example of priority queue
        Queue<Integer> integerPQ = new PriorityQueue<>(7);
        Random rand = new Random();
        //***** generate Integer random numbers less than 20
        for(int i=0;i<7;i++){
            integerPQ.add(new Integer(rand.nextInt(20)));
        }
        for(int i=0;i<7;i++){
            Integer in = integerPQ.poll();
            System.out.println("Processing Integer:"+in);
        }
        //PriorityQueue example with Comparator
        Queue<Customer> customerPQ = new PriorityQueue<>(7, idComparator1);
        addDataToQueue(customerPQ);
        pollDataFromQueue(customerPQ);
    }
    //GOOD
    //Comparator anonymous class implementation
    public static Comparator<Customer> idComparator1 = new Comparator<Customer>(){
        @Override
        public int compare(Customer c1, Customer c2) {
            return (int) (c1.getId() - c2.getId());
        }
    };
    public static Comparator<Customer> idComparator2 = new Comparator<Customer>(){
        @Override
        public int compare(Customer c1, Customer c2) {
            return (int) (c1.getId() - c2.getId());
        }
    };

    //utility method to add random data to Queue
    private static void addDataToQueue(Queue<Customer> customerPriorityQueue) {
        Random rand = new Random();
        for(int i=0; i<7; i++){
            int id = rand.nextInt(20);
            customerPriorityQueue.add(new Customer(id, "Pankaj "+id));
        }
    }
    //utility method to poll data from queue
    private static void pollDataFromQueue(Queue<Customer> customerPriorityQueue) {
        while(true){
            Customer cust = customerPriorityQueue.poll();
            if(cust == null) break;
            System.out.println("Processing Customer with ID="+cust.getId());
        }
    }
    public static class Customer {

        private int id;
        private String name;

        public Customer(int i, String n){
            this.id=i;
            this.name=n;
        }
        public int getId() {
            return id;
        }
        public String getName() {
            return name;
        }

    }
}
