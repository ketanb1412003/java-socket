import java.net.*;
import java.io.IOException;
import java.util.Scanner;s

public class TCPServer {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int x;
    x = sc.nextInt();
    // Here, we create a Socket instance named socket
    ServerSocket serverSocket = new ServerSocket(5001);
    System.out.println("x=" +x);
    Socket clientSocket = serverSocket.accept();
    String clientSocketIP = clientSocket.getInetAddress().toString();
    int clientSocketPort = clientSocket.getPort();
    System.out.println("[IP: " + clientSocketIP + " ,Port: " + clientSocketPort +"]  " + "Client Connection Successful!");
  }
}