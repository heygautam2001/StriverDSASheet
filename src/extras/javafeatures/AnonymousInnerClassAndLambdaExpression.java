package extras.javafeatures;

interface Employees{
    public String getSalary();
    public String getDesignation();
}

class DevOps implements Employees{
    @Override
    public String getSalary() {
        return "10";
    }

    @Override
    public String getDesignation() {
        return "I am a DevOps Engineer";
    }
}



public class AnonymousInnerClassAndLambdaExpression {
    public static void main(String[] args) {

        Employees employee = new DevOps();
        System.out.println(employee.getSalary());
        System.out.println(employee.getDesignation());

        // But you create a class for implementing methods but instead of that you can use
        // Anonymous inner class

        Employees employees = new Employees() {
            @Override
            public String getSalary() {
                return "DevOps Engineer";
            }

            @Override
            public String getDesignation() {
                return "25000";
            }
        };

        System.out.println( employees.getDesignation() +": "+employees.getSalary());
    }



}
