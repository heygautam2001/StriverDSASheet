package extras.generics;

import java.util.ArrayList;
import java.util.List;

public class Pair <K , V>{
    private K key;
    private V value;

    public K getKey(){
        return this.key;
    }

    public void setKey(K key){
        this.key = key;
    }

    public V getValue(){
        return this.value;
    }

    public void setValue(V value){
        this.value = value;
    }

    public static void main(String[] args) {
        Pair <Integer , String> pair = new Pair<>();
        pair.setKey(1);
        pair.setValue("Hello");
        System.out.println(pair.getKey()+" : "+pair.getValue());

        List<Pair> p = new ArrayList<>();
        p.add(pair);
        System.out.println(p.get(0).getKey() +" : "+p.get(0).getValue());
    }

    /*
    T : Type
    E : Element (used in collections);
    K : key (used in maps);
    V : values (used in maps);
    N : Number.

         */

}
