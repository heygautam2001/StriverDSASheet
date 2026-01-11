package CollectionsInJava.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Person{
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        Person other = (Person) obj;
        return id == other.getId() && Objects.equals(name,other.getName());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

}
public class HashCodeAndEqualsMethod {
    public static void main(String[] args) {
        HashMap<Person,String> map = new HashMap<>();
        Person p1 = new Person("Alice",1);
        Person p2 = new Person("Bob",2);
        Person p3 = new Person("Alice",2);

        map.put(p1,"Engineer"); // hashcode --> index1
        map.put(p2,"Designer"); // hashcode---> index2
        map.put(p3,"Manager"); // hashcode----> index3

        Map<String,Integer> map1 = new HashMap<>();
        map1.put("Shubham",90); // hashcode ----> index1
        map1.put("Neha",92); // hashcode ----> index2
        map1.put("shubham",99); // hashcode ----> index1 ----> equals()--->replace

    }
}
