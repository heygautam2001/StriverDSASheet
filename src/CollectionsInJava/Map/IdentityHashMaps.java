package CollectionsInJava.Map;

import java.util.Map;
import java.util.IdentityHashMap;

public class IdentityHashMaps {
    public static void main(String[] args) {
        Map<String,Integer> map = new IdentityHashMap<>();
        String key1 = new String("key");
        String key2 = new String("key");
//        String key1 = "key";
//        String key2 = "key";
        // IdentityHashcode and ==
        map.put(key1,1); // key = 1
        map.put(key2,2); // key = 2
        System.out.println(map);
        System.out.println(System.identityHashCode(key1));
        System.out.println(System.identityHashCode(key2));
        System.out.println(key1.hashCode());
        System.out.println(key2.hashCode());


    }
}
