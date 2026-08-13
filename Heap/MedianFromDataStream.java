import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFromDataStream {

    PriorityQueue<Integer> lower =
            new PriorityQueue<>(Collections.reverseOrder());

    PriorityQueue<Integer> higher =
            new PriorityQueue<>();

    public void addNumber(int num) {

        lower.offer(num);

        higher.offer(lower.poll());

        if (higher.size() > lower.size()) {

            lower.offer(higher.poll());
        }
    }

    public double getMedian() {

        if (lower.size() == higher.size()) {

            return (lower.peek() + higher.peek()) / 2.0;
        }

        return lower.peek();
    }

    public static void main(String[] args) {

        MedianFromDataStream median = new MedianFromDataStream();

        median.addNumber(10);
        median.addNumber(20);
        median.addNumber(30);

        System.out.println("Median = " + median.getMedian());

        median.addNumber(40);

        System.out.println("Median = " + median.getMedian());
    }
}