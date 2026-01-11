package CollectionsInJava.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMap01 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Shubham");
        map.put(2,"Akshits");
        map.put(3,"Vipul");
        map.put(4,"Bob");
        map.putIfAbsent(5,"Charlie");
        System.out.println(map);

        System.out.println(map.get(2));
        System.out.println(map.get(69));

        System.out.println(map.size());

        System.out.println(map.containsKey(1));

        System.out.println(map.containsValue("Akshits"));

        for(int key : map.keySet()){
            System.out.println(key +" : "+map.get(key) );
        }

        for(Map.Entry<Integer,String> entry : map.entrySet()) {
            System.out.println(entry);
        }

        //contains multiple null values but only a single null key
        map.putIfAbsent(6,null);
        map.put(7,null);
        map.put(null, "Gautam");
        map.put(null,"Venom"); // It updates the things.

        System.out.println(map);

        map.remove(1);
        System.out.println(map);

        map.remove(2,"Nitin"); // not removed because nitin is not present.

        System.out.println(map.containsValue("Nitin"));

    }
}
