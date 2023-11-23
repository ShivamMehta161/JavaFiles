import java.io.*;
import java.net.*;

public class MyServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(3333);
            System.out.println("Server is waiting for client...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected");

            // Creating input and output streams for communication
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Reading and printing messages from the client
            while (true) {
                String clientMessage = in.readLine();
                if (clientMessage.equals("bye")) {
                    System.out.println("Client disconnected");
                    break;
                }
                System.out.println("Client: " + clientMessage);

                // Sending a response back to the client
                String response = "Server received: " + clientMessage;
                out.println(response);
            }

            // Closing resources
            in.close();
            out.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
