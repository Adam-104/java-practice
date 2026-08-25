package oops;

import oops.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Adam");
        employee.setSalary(5000);

        System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
    }
}
