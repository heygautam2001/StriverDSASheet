package extras.multiThreading;

import java.net.PortUnreachableException;

class Counter {
    private int count = 0;
//    public void increment(){
//        count++;
//    }

    public synchronized void increment(){
        count++;
    }

//    public void increment() {
//        synchronized (this) {
//            count++;
//        }
//    }

    public int getCount() {
        return count;
    }
}

class MyThread5 extends Thread {
    private Counter counter;

    public MyThread5(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class Synchronization {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        MyThread5 t1 = new MyThread5(counter);
        MyThread5 t2 = new MyThread5(counter);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(counter.getCount());

    }
}
