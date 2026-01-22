package Day03;
import java.util.Scanner;

class User{
    User(String name, int prn){
        System.out.println("Name: " + name);
        System.out.println("Prn: " + prn);
    }
}

public class Q1 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter prn: ");
        int prn = sc.nextInt();

        new User(name,prn);

        sc.close();
    }
}
