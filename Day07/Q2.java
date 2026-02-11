package Day07;

import java.util.ArrayList;
// import java.util.Scanner;
import java.util.Scanner;

class Student{
    String name;
    ArrayList<Double> grades=new ArrayList<>();

    Student(String name){
        this.name=name;
    }

    String getName(){
        return name;
    }

    void addGrade(double grade){
        grades.add(grade);
    }

    double sum=0;
    double avg;
    Double calculateAverage(){
        for(double val : grades){
            sum+=val;
        }

        avg=(sum/grades.size());
        return avg;
    }

    void displayStudentDetails(){
        System.out.println("Name: " + name);
        System.out.println("Grades: " + grades);
        System.out.println("Average: " + avg);
    }
}

class GradeManager{
    ArrayList<Student> students=new ArrayList<>();
    
    void addStudent(Student student){
        students.add(student);
    }

    String findStudentByName(String name){
        for(Student std : students){
            if(name.equals(std.getName())){
                return "Student found with Name: " + std.getName() + " and Avg: " + std.avg;
            }
        }
        return "Student with such name not found";
    }

    void displayAllStudents(){
        for(Student std : students){
            std.displayStudentDetails();
        }
    }
}

public class Q2 {
    public static void main(String[] arg){
         Scanner sc = new Scanner(System.in);
        GradeManager manager = new GradeManager();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("\nEnter name of student " + i + ": ");
            String name = sc.nextLine();

            Student student = new Student(name);

            System.out.print("Enter number of grades for " + name + ": ");
            int g = sc.nextInt();

            for (int j = 1; j <= g; j++) {
                System.out.print("Enter grade " + j + ": ");
                double grade = sc.nextDouble();
                student.addGrade(grade);
            }
            sc.nextLine();

            manager.addStudent(student);
        }

        System.out.println("\nStudent Details");
        manager.displayAllStudents();

        sc.close();
    }
}