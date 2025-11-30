package extras.comparatorComparable;


public class Employee implements Comparable<Employee>{
    int emp_id;
    String emp_name;
    boolean isWorking;
    public Employee(){

    }
    public Employee(int emp_id, String emp_name , boolean isWorking){
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.isWorking = isWorking;
    }
    @Override
    public int compareTo(Employee e) {
        return Boolean.compare(this.isWorking , e.isWorking);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", emp_name='" + emp_name + '\'' +
                ", isWorking=" + isWorking +
                '}';
    }
}
