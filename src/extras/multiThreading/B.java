package extras.multiThreading;

//public class B extends A , Thread{
//    // Multiple inheritance not supported in java wrt class
//    // Hence in that case you have to use interface and Implements runnable interface
//}

public class B extends A implements Runnable{
    @Override
    public void run() {
        System.out.println("Multiple inheritance not supported in java wrt class");
        System.out.println("Hence in that case you have to use interface and Implements runnable interface  ");
    }
}