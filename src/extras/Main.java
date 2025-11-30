//package extras;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.List;
//class StringLengthComparator implements Comparator<String>{
//
//    @Override
//    public int compare(String o1, String o2) {
//        return o2.length() - o1.length();
//    }
//
//    // function returns positive ---> o1 comes after o2;
//    // function returns negative ---> o1 comes before o2;
//
//}
//
//class  MyComparator implements Comparator<Integer>{
//    @Override
//    public int compare(Integer o1, Integer o2) {
////        return o1-o2;
//        return o2-o1;
//    }
//
//    // if function return negative means o1 comes before o2
//   //  if function return positive means o1 comes after o2
//// 01 02
//// 5 3
//}
//
//// Classes
//
//public class Student implements Comparator<Student>{
//   String name;
//   Double gpa;
//
//   public Student(String name , Double gpa){
//       this.name = name;
//       this.gpa = gpa;
//   }
//
//    @Override
//    public int compare(Student o1, Student o2) {
//
//       return Double.compare(o2.gpa,o1.gpa);
//
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        List <Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(3);
//        list.add(1);
//        /*
//        System.out.println("Before sorting"+list);
//        list.sort(null); // Natural order of sorting
//        System.out.println("after sorting"+list);
//       */
//
//        System.out.println("Before sorting"+list);
//        list.sort(new MyComparator());
//        System.out.println("after sorting"+list);
//
//
//        List<String> word = Arrays.asList("banana","apple","date");
//        /*
//        System.out.println("Before sorting"+word);
//        word.sort(null); // Natural order of sorting
//        System.out.println("after sorting"+word);
//         */
//
////        System.out.println("Before sorting"+word);
////        word.sort(new StringLengthComparator());
////        System.out.println("after sorting"+word);
//
//        // we can also use lambda expression
//        /*
//        System.out.println(word);
//        word.sort((a,b) -> a.length()-b.length()); //Ascending
//        word.sort((a,b) -> b.length() - a.length() ); // descending
//        System.out.println(word);
//*/
//        // Sorting the object type of data
//        List <Student> students = new ArrayList<>();
//        students.add(new Student("Alice" , 3.5));
//        students.add(new Student("Bob",3.7));
//        students.add(new Student("Charlie",3.2 ));
//        students.add(new Student("Akshit",3.9));
//
//        for(Student s : students){
//            System.out.println(s.name+" "+s.gpa);
//        }
////        students.sort(null); // Error...
//
////        students.sort((a,b)-> (int) (a.gpa - b.gpa));
//        students.sort((a,b)->{
//            if(b.gpa - a.gpa > 0)
//                return 1;
//            else if(b.gpa - a.gpa < 0)
//                return -1;
//            else
//                return 0;
//        });
//
//        for(Student s : students){
//            System.out.println(s.name+" "+s.gpa);
//        }
//
//
//
//
//    }
//}
