package extras.comparatorComparable;

import java.util.Comparator;

class MyComparator implements Comparator<Integer>{
    @Override
    // if function returns negative then o1 come before o2;
    // if function returns positive then o2 come before o1;

    // o1   o2
    // 5     3
    public int compare(Integer o1, Integer o2) {
        return o2-o1; // descending
//        return o1-o2;  // ascending
    }
}

class StringComparator implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
//        return o1.length() - o2.length();
        return o2.length() - o1.length();
    }
}

class StudentComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        if (o2.getPercentage() - o1.getPercentage() > 0)
            return 1;
        else if (o2.getPercentage() - o1.getPercentage() < 0)
            return -1;
        else
            return 0;

    }
}
public class Student{
   private int id;
    private String name;
    private double percentage;
public Student(){

}
    public Student(int id, String name, double percentage ){
        this.id = id;
        this.name = name;
        this.percentage = percentage;
    }

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

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", percentage=" + percentage +
                '}';
    }
}
