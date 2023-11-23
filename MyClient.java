import java.io.*;
import java.net.*;

public class MyClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 3333);

            // Creating input and output streams for communication
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Reading and sending messages to the server
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            String message;

            while (true) {
                // Reading user input
                System.out.print("Enter message (type 'bye' to exit): ");
                message = userInput.readLine();

                // Sending the message to the server
                out.println(message);

                // Breaking the loop if the user types 'bye'
                if (message.equals("bye")) {
                    break;
                }

                // Reading and printing the server's response
                String serverResponse = in.readLine();
                System.out.println("Server: " + serverResponse);
            }

            // Closing resources
            in.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
