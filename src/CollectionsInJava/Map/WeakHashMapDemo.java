package CollectionsInJava.Map;

import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) throws InterruptedException {
        // Most of the time not used , Rarely used
        WeakHashMap<String,String> weakHashMap = new WeakHashMap<>();
        weakHashMap.put(new String("1"),"Gautam");
        weakHashMap.put(new String("2"),"Sunil");
        weakHashMap.put(new String("3"),"Amit");
        weakHashMap.put(new String("4"),"Anil");
        weakHashMap.put(new String("5"),"Sachin");
        weakHashMap.put(new String("6"),"Sarovar");
        System.out.println(weakHashMap);
        Thread.sleep(10000);
        System.gc();
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 10000 ; i++) {

            }
        });
        System.out.println(weakHashMap);
    }
}
