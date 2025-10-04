import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Developer emp_1 = new Developer("David", 1);
        Manager emp_2 = new Manager("Margaret", 2);

        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(emp_1);
        employeeArrayList.add(emp_2);

        for (Employee employee : employeeArrayList) {
            System.out.println(employee.getName());
            System.out.println(employee);
        }
    }
}