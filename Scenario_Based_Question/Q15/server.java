package Scenario_Based_Question.Q15;

import java.io.*;
import java.net.*;

public class server {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(5000);
            System.out.println("Server is waiting for client...");

            Socket socket = server.accept();
            System.out.println("Client connected!");

            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            int num1 = in.readInt();
            int num2 = in.readInt();

            System.out.println("Received numbers: " + num1 + ", " + num2);

            int result = num1 % num2;

            out.writeInt(result);

            System.out.println("Result sent to client: " + result);

            socket.close();
            server.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
