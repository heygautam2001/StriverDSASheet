package extras.multiThreading;
class NewWorld implements Runnable{
    @Override
    public void run() {
        for (; ; ) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
public class Test {
    public static void main(String[] args) {
        NewWorld world = new NewWorld();
        Thread t1 = new Thread(world);

        t1.start();
        for ( ;  ; ) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
