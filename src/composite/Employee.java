package composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    public int id, next_id = 1;
    public String name, department_name;
    public double salary;
    public List<Employee> subordinates = new ArrayList<Employee>();

    Employee(String name_value, String department_name_value, double salary_value) {
        this.id = this.next_id++;
        this.name = name_value;
        this.department_name = department_name_value;
        this.salary = salary_value;
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public void add(Employee employee) {
        subordinates.add(employee);
    }

    public void remove(Employee employee) {
        subordinates.remove(employee);
    }

    public String toString () {
        return this.name + " " + this.department_name + ". Subordinates: " + getSubordinates();
//        return getId() + ". " + getName() + " " + getSurname() + " - " + getSalary() + "; manager - " + getManagerName() + "; top manager - " + getTopManager().getName() + " " + getTopManager().getSurname();
    }

}

