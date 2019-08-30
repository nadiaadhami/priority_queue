package nadiatests;

/**
 http://stackoverflow.com/questions/683041/java-how-do-i-use-a-priorityqueue
 */
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample2
{
    public static void main(String[] args)
    {
        Comparator<String> comparator = new StringLengthComparator();
        //*********************************
        PriorityQueue<String> queue =
                new PriorityQueue<String>(10, comparator);
        queue.add("short");
        queue.add("very long indeed");
        queue.add("medium");
        queue.add("super long");

        while (queue.size() != 0)
        {
            System.out.println(queue.remove());
        }
    }
}

