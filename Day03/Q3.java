package Day03;
import java.util.Scanner;

class Student{
    String name;
    int prn;
    String department;
    static String CollegeName = "Symbiosis";
    
    Student(){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Your name: ");
        name = sc.nextLine();

        System.out.print("Enter Your department: ");
        department = sc.nextLine();

        System.out.print("Enter Your prn: ");
        prn = sc.nextInt();
    }

    void display(){
        System.out.println("\nCollege: " + CollegeName);
        System.out.println("Name: " + name);
        System.out.println("Prn: " + prn);
        System.out.println("Department: " + department);
        System.out.println();
    }
}

public class Q3 {
    public static void main(String[] arg){
        Student s1 = new Student();
        Student s2 = new Student();

        s1.display();
        s2.display();
    }
}
