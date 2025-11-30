package extras.javafeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
class Student{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int id , String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class FunctionDriver {
    public static void main(String[] args) {
        Function<String,Integer> getLength = string -> string.length();
        System.out.println(getLength.apply("Hello Gautam"));

        Function<String,String> func2 = string -> string.substring(0,3);
        System.out.println(func2.apply("Gautam"));

        Function<List<Student>,List<Student>> studentsWithVipsPrefix = (list)->{
            List<Student> result =  new ArrayList<>();
            for(Student s : list){
                if (func2.apply(s.getName()).equalsIgnoreCase("vip")){
                    result.add(s);
                }
            }
            return result;
        };

        Student s1  = new Student(2,"vipul");
        Student s2 =  new Student(1,"viplav");
        Student s3  = new Student(3,"vikas");
        Student s4 =  new Student(4,"vipin");
        Student s5  = new Student(5,"vinay");
        Student s6 =  new Student(6,"parnav");



      List<Student> students =  Arrays.asList(s1,s2,s3,s4,s5,s6);
    List<Student> filteredStudent =  studentsWithVipsPrefix.apply(students);
        System.out.println(filteredStudent);


    }
}
