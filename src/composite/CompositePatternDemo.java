package composite;

public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee employee = new Employee("Pol Makartni", "test", 1);
        Employee employee_2 = new Employee("Stiles Stilinski", "test1", 2);
        Employee employee_3 = new Employee("Olha Kozlovska", "test3", 3);
        Employee employee_4 = new Employee("Pol Makartni", "test", 3);
        Employee employee_5 = new Employee("Olha Stilinski", "test3", 3);
        employee.add(employee_2);
        employee.add(employee_3);
        employee_2.add(employee_4);
        employee_4.add(employee_5);
        employee.remove(employee_3);
        System.out.println(employee);
        System.out.println(employee_2);
        System.out.println(employee_3);
        System.out.println(employee_4);
        System.out.println(employee_5);
    }
}
