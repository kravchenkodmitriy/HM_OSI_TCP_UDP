import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;


public class Main {

    public static final int port = 8082;


    public static void main(String[] args) throws IOException {

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            while (true)
            try (Socket clienSocket = serverSocket.accept();
                 PrintWriter out = new PrintWriter(clienSocket.getOutputStream(), true);
                 BufferedReader in = new BufferedReader(new InputStreamReader(clienSocket.getInputStream()))) {
                 {
                    System.out.println("Новое подключение принято");
                    final String name = in.readLine();
                    out.println(String.format("Hi %s, your is %d", name, clienSocket.getPort()));
                }
            }
        }
        }

}
