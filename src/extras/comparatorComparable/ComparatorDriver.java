package extras.comparatorComparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorDriver
{
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(4);
        li.add(2);
        li.add(7);
        li.add(6);
        li.add(5);
//        System.out.println(li);
//        li.sort(new MyComparator());
//        System.out.println(li);

        List <String> li2 = new ArrayList<>();
        li2.add("Gautam");
        li2.add("Ayush Duklan");
        li2.add("Nitin kumar");
        li2.add("Baman");
        li2.add("Vikas");
        li2.add("Zoya");
//        System.out.println(li2);
////        li2.sort(null); // It sorts in lexo-graphical order.
//        li2.sort(new StringComparator());
//        System.out.println(li2);

        Student s1 = new Student(1,"Ayush" , 78.99);
        Student s2 = new Student(2,"Gautam" ,89.0);
        Student s3 = new Student(3,"Ankit" , 69.99);
        Student s4 = new Student(4,"Anoop" ,79.0);

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        System.out.println(students);

     Comparator<Student> comparator =  Comparator.comparing(Student::getPercentage);// sort in ascending
     Comparator<Student> comparator1 =  Comparator.comparing(Student::getPercentage).reversed().thenComparing(Student::getName);
//      students.sort(null); // Runtime Error
//        students.sort((a,b) -> {
//            if(b.getPercentage() - a.getPercentage() > 0){
//                return 1;
//            } else if (b.getPercentage() - a.getPercentage() < 0) {
//                return -1;
//            }else {
//                return 0;
//            }
//        });
//        students.sort(comparator1);
        students.sort(new StudentComparator());
        System.out.println(students);
    }

}
