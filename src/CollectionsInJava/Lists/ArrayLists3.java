package CollectionsInJava.Lists;

import extras.comparatorComparable.Student;
import extras.multiThreading.A;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Sort Integer in descending order...
class MyComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}

// String Comparator....
class myStringComparator implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}

class Students{
   private double gpa;
   private String name;
   public Students(String name, double gpa){
       this.name = name;
       this.gpa = gpa;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Students{" +
                "gpa=" + gpa +
                ", name='" + name + '\'' +
                '}';
    }
}

class MyStudentComparator implements Comparator<Students>{
    @Override
    public int compare(Students o1, Students o2) {
       return Double.compare(o2.getGpa(),o1.getGpa());
    }
}




public class ArrayLists3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(2);


//        System.out.println(list);
//        list.sort(new MyComparator());
//        System.out.println(list);

        List<String> list1 = new ArrayList<>();
        list1.add("sugar");
        list1.add("vinegar");
        list1.add("ginger");
        list1.add("corriender");
//        System.out.println(list1);
//        list1.sort(null);
//        System.out.println(list1);
//
//        list1.sort(new myStringComparator());
//        System.out.println(list1);

        List<Students> students = new ArrayList<>();
        students.add(new Students("Vipul",7.9));
        students.add(new Students("Akshit", 8.0));
        students.add(new Students("Gautam" , 7.5));
        students.add(new Students("Vinay",6.4));
        System.out.println(students);
//        students.sort(null);
        students.sort(((o1, o2) -> {
            if(o2.getGpa()-o1.getGpa() < 1){
                return 1;
            } else if (o2.getGpa()-o1.getGpa() > 1) {
                return -1;
            }else {
                return 0;
            }
        }));
        System.out.println(students);

//        for(Students s : students){
//            System.out.println(s.getName()+" "+s.getGpa());
//        }

    }
}
