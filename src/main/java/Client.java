import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class Client {

    public static void main(String[] args) {

        try (
                Socket clientSocket = new Socket("localhost", 8082);
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));){
            System.out.println("Новое подключение принято");

            String name = in.readLine();
            System.out.println(name);

        } catch (IOException e) {
            throw new RuntimeException();
        }

    }
}
