package CollectionsInJava.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class HashMap02 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        map.put("Apple",10);
        map.put("Banana",20);
        map.put("Kela",45 );
//        System.out.println(map);

//        for(Map.Entry<String,Integer> entry : map.entrySet() ){
//            System.out.println(entry);
//        }

        LinkedHashMap<String,Integer> map1 = new LinkedHashMap<>(11,0.3f,true); // least recently used access order...
        map1.put("Apple",10);
        map1.put("Banana",20);
        map1.put("Kela",45 );
        // Least recently used...
        map1.get("Apple");
        map1.get("Banana");

        for(Map.Entry<String,Integer> entry : map1.entrySet() ){
           System.out.println(entry);
        }
        //Not thread safe.
    }
}
