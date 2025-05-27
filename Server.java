import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5000);
        Socket client = serverSocket.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);

        String line;
        while ((line = in.readLine()) != null) {
            System.out.println("Client: " + line);
            out.println("Echo: " + line);
        }
    }
}
