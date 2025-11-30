package extras.multiThreading;
// 1. Start() , 2. run() , 3. sleep() , 4. Join() , 5.setPriority();
// 6. yield() , 7. setDaemon()

class MyThread2 extends Thread{
    public MyThread2(String name){
        super(name);
    }
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("Thread is running....");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
   }
}



class MyThread1 extends Thread{
    public MyThread1(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            String str = "";
            for (int j = 0; j < 1000; j++) {
                str += "a";
            }
            System.out.println(Thread.currentThread().getName()+" -Priority "+Thread.currentThread().getPriority()+"-count : "+i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class MyThread3 extends Thread{
    // yield() : it provides the chance to another thread to execute
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+" is running");
//            Thread.yield();
            Thread.yield();
        }
    }
}

class MyThread4 extends Thread{
    @Override
    public void run() {
       while (true){
           System.out.println(Thread.currentThread().getName());
       }
    }
}


public class ThreadMethods {
    public static void main(String[] args) {
//        MyThread1 minPriority =  new MyThread1("Low/min Priority Thread ");
//        MyThread1 normalPriority = new MyThread1("Normal/Mid Priority Thread");
//        MyThread1 maxPriority = new MyThread1("high/Max Priority Thread");
//        minPriority.setPriority(Thread.MIN_PRIORITY);
//        normalPriority.setPriority(Thread.NORM_PRIORITY);
//        maxPriority.setPriority(Thread.MAX_PRIORITY);
//        minPriority.start();
//        normalPriority.start();
//        maxPriority.start();

//        MyThread2 m1 = new MyThread2("Interrupt");
//        m1.start();
//        m1.interrupt();

//        MyThread3 t1 = new MyThread3();
//        MyThread3 t2 = new MyThread3();
//        t1.start();
//        t2.start();

        MyThread4 myThread = new MyThread4();
        myThread.setDaemon(true);

        MyThread4 t1 = new MyThread4();
        t1.start();
        myThread.start();
        System.out.println("Main done");

    }
}
// Output without Yield
//Thread-0 is running
//Thread-0 is running
//Thread-0 is running
//Thread-0 is running
//Thread-0 is running
//Thread-0 is running
//Thread-0 is running
//Thread-0 is running
//Thread-0 is running
//Thread-0 is running
//Thread-1 is running
//Thread-1 is running
//Thread-1 is running
//Thread-1 is running
//Thread-1 is running
//Thread-1 is running
//Thread-1 is running
//Thread-1 is running
//Thread-1 is running
//Thread-1 is running

// Output with Yield

//Thread-0 is running
//Thread-1 is running
//Thread-0 is running
//Thread-0 is running
//Thread-1 is running
//Thread-0 is running
//Thread-1 is running
//Thread-0 is running
//Thread-1 is running
//Thread-0 is running
//Thread-1 is running
//Thread-0 is running
//Thread-1 is running
//Thread-0 is running
//Thread-1 is running
//Thread-1 is running
//Thread-0 is running
//Thread-1 is running
//Thread-0 is running
//Thread-1 is running


