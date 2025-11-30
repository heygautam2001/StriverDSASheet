package extras.javafeatures;
@FunctionalInterface
public interface Employee {
    String getName();
}

class SoftwareEngineer implements Employee{
    @Override
    public String getName() {
        return "This is user !";
    }
}

class EmployeeDriver{
    public static void main(String[] args) {
        SoftwareEngineer engineer = new SoftwareEngineer();//Here we have to create an extra class
        // for implementing a single method contains in Employee.
        // Instead of that we can use lambda expression. java 8 feature.
        System.out.println(engineer.getName());

        Employee employee = ()->{
          return "I am a software Engineer";
        };
        System.out.println(employee.getName());

        Employee employee1 = () ->  "I am a web Developer";
        System.out.println(employee1.getName());
    }
}
