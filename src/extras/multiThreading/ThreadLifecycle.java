package extras.multiThreading;

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("RUNNING");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
public class ThreadLifecycle {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread(); //New
        System.out.println(t1.getState());

        t1.start(); // Runnable/Running state
        System.out.println(t1.getState());

        t1.sleep(3000);
        System.out.println(t1.getState());

        t1.join();
        System.out.println(t1.getState());

    }
}
