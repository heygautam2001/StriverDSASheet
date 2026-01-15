package CollectionsInJava.Map;

import java.util.concurrent.ConcurrentSkipListMap;
//1. What is ConcurrentHashMap?
//ConcurrentHashMap<K, V> is a thread-safe, high-performance implementation of Map designed for concurrent access by multiple threads without blocking the entire map.
//Package: java.util.concurrent
//Introduced: Java 5
//Optimized significantly in Java 8
//It allows:
//Concurrent reads
//Concurrent writes
//High scalability with minimal contention

public class ConcurrentSkipListMaps {
    public static void main(String[] args) {
        ConcurrentSkipListMap<String,Integer> map = new ConcurrentSkipListMap();
        map.put("Apple",2);

    }
}
