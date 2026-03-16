package Day11;

class Employee{
    String name;
    double baseSalary;

    Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }

    double calculateSalary(){
        return baseSalary + (baseSalary * (5.0 / 100));
    }
}

class Manager extends Employee{
    Manager(String name, double baseSalary){
        super(name,baseSalary);
    }

    @Override
    double calculateSalary(){
        double employeeSalary = super.calculateSalary();
        return employeeSalary + 2000.0;
    }
}

class Executive extends Manager{
    Executive(String name, double baseSalary){
        super(name,baseSalary);
    }

    @Override
    double calculateSalary(){
        double managerSalary = super.calculateSalary();
        return managerSalary + baseSalary * (10.0 / 100);
    }
}

public class Q2 {
    public static void main(String[] arg){
        Employee e = new Employee("Alice", 10000);
        Employee m = new Manager("Bob", 10000);
        Employee ex = new Executive("Charlie", 10000);

        double result1 = e.calculateSalary();
        double result2 = m.calculateSalary();
        double result3 = ex.calculateSalary();

        System.out.printf("%.2f",result1);
        System.out.println();
        System.out.printf("%.2f",result2);
        System.out.println();
        System.out.printf("%.2f",result3);
    }
}
