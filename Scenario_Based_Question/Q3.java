package Scenario_Based_Question;

import java.sql.*;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/student_details";
        String user = "root";
        String password = "Rudra@2006";

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number to search: ");
        int rollNo = sc.nextInt();

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);

            String query = "SELECT * FROM Student WHERE rollno = ?";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, rollNo);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("\nStudent Found");
                System.out.println("Roll No: " + rs.getInt("rollno"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Age: " + rs.getInt("age"));
            } else {
                System.out.println("\nNo student found with Roll No: " + rollNo);
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
