package CollectionsInJava.Queues;

import javax.swing.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer implements Runnable{
    private BlockingQueue<Integer> queue;
    private int value = 0;

    public Producer(BlockingQueue<Integer> queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            System.out.println("producer Produced : "+value);
            value++;
            try {
                queue.put(value);
                Thread.sleep(500);
            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
                Thread.currentThread().interrupt();
                System.out.println("Producer Interrupted");
            }

        }
    }
}

class Consumer implements Runnable{
private BlockingQueue<Integer> queue;
 public Consumer(BlockingQueue<Integer> queue){
     this.queue = queue;
 }
    @Override
    public void run() {
     while (true){
         try {
             Integer value = queue.take();
             System.out.println("Consumer consumed value :"+value);
             Thread.sleep(2000);
         } catch (InterruptedException e) {
             Thread.currentThread().interrupt();
             System.out.println("Consumer interrupted");
//             throw new RuntimeException(e);
         }

     }

    }
}

public class BlockingQueueDemo {
    // thread-safe queue
    // wait for queue to become non-empty/ wait for space
    // simplify concurrency problems like producer/consumer
    // standard queue -> immediately
       // empty ---> remove (no waiting)
       // full ---> add (no waiting)
    //Blocking queue
    // put ---> Blocks if the queue is full until space became available
    // take ---> Blocks if the queue is empty until an elements becomes available
    // offer --> waits for space to become available, upto the specified timeout
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
        // A bounded blocking queue backed by an array
        Thread producer = new Thread(new Producer(queue));
        Thread consumer = new Thread(new Consumer(queue));
        producer.start();
        consumer.start();
    }
}
