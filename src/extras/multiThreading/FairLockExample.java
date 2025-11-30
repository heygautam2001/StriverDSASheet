package extras.multiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairLockExample {
    private  final Lock fairLock = new ReentrantLock(true);
    public void accessResource() {

        fairLock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " acquired the lock");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            fairLock.unlock();
            System.out.println(Thread.currentThread().getName() + " lock is released");

        }
    }
    public static void main(String[] args) throws InterruptedException {
        FairLockExample example1 = new FairLockExample();
        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                example1.accessResource();
            }
        };

        Thread thread4 = new Thread(task1, "Thread 1");
        Thread thread5 = new Thread(task1, "Thread 2");
        Thread thread6 = new Thread(task1, "Thread 3");

        thread4.start();
        Thread.sleep(50);
        thread5.start();
        Thread.sleep(50);
        thread6.start();
        Thread.sleep(50);
    }
}
