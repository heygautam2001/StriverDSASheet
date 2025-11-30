package extras.multiThreading;

public class World extends Thread{
    @Override
    public void run() {
        for ( ;  ; ) {
            System.out.print("WORLD"+" ");
        }
    }
}
