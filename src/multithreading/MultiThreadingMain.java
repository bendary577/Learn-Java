package multithreading;

import multithreading.synchronization.ConsumerThread;
import multithreading.synchronization.ProducerThread;

import java.util.ArrayList;
import java.util.List;

public class MultiThreadingMain {

    //shared resource were a race condition is happening on
    public static List<Integer> bucket = new ArrayList<>();

    public static void main(String[] args){
        ProducerThread p1 = new ProducerThread("p1");
        ProducerThread p2 = new ProducerThread("p2");

        ConsumerThread c1 = new ConsumerThread("c1");
        ConsumerThread c2 = new ConsumerThread("c2");

        p1.start();
        p2.start();
        c1.start();
        c2.start();

    }
}
