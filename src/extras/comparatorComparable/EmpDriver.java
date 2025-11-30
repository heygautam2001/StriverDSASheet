package extras.comparatorComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpDriver {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(5);
        li.add(2);
        li.add(1);
        li.add(3);
        li.add(4);
        System.out.println(li);
        Collections.sort(li);
        System.out.println(li);

        Employee e1 = new Employee(1,"Gautam" ,true);
        Employee e2 = new Employee(2,"Roshan" ,false);
        Employee e3 = new Employee(3,"Shivam" ,true);
        Employee e4 = new Employee(4,"Vineet" ,false);
        Employee e5 = new Employee(5,"Ravi" ,false);

        List <Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        System.out.println(employees);
        employees.sort(null);
        System.out.println(employees);
    }
}
