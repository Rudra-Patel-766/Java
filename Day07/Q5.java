package Day07;

import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    String empid;
    String name;
    String role;
    double baseSalary;
    double monthlySalary;

    Employee(String empid, String name, String role, double baseSalary) {
        this.empid = empid;
        this.name = name;
        this.role = role;
        this.baseSalary = baseSalary;
    }

    void calculateSalary() {
        switch (role) {
            case "Manager":
                monthlySalary = baseSalary + (baseSalary * 20.0 / 100);
                break;

            case "Developer":
                monthlySalary = baseSalary + (baseSalary * 10.0 / 100);
                break;

            case "Designer":
                monthlySalary = baseSalary + (baseSalary * 5.0 / 100);
                break;

            case "Intern":
                monthlySalary = 1000;
                break;

            default:
                monthlySalary = 0;
        }
    }

    void applyDeduction(double amount) {
        monthlySalary -= amount;
    }

    void displayEmployeeDetails() {
        System.out.println("\nEmployee ID: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Monthly Salary: " + monthlySalary);
    }
}

class Payroll {
    ArrayList<Employee> employees = new ArrayList<>();

    void addEmployee(Employee employee) {
        employees.add(employee);
    }

    void calculateAllSalaries() {
        for (Employee e : employees) {
            e.calculateSalary();
            e.displayEmployeeDetails();
        }
    }

    Employee findEmployeeById(String employeeId) {
        for (Employee e : employees) {
            if (e.empid.equals(employeeId)) {
                return e;
            }
        }
        return null;
    }
}

public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Payroll payroll = new Payroll();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter Employee " + i + " details: ");

            System.out.print("Enter Employee ID: ");
            String id = sc.next();

            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Enter Role (Manager/Developer/Designer/Intern): ");
            String role = sc.next();

            System.out.print("Enter Base Salary: ");
            double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, role, salary);
            payroll.addEmployee(emp);
        }

        System.out.println("\nSalary Details: ");
        payroll.calculateAllSalaries();

        System.out.print("\nEnter Employee ID for deduction: ");
        String searchId = sc.next();

        Employee emp = payroll.findEmployeeById(searchId);
        if (emp != null) {
            System.out.print("Enter deduction amount: ");
            double deduction = sc.nextDouble();
            emp.applyDeduction(deduction);
            emp.displayEmployeeDetails();
        } else {
            System.out.println("Employee not found");
        }

        sc.close();
    }
}