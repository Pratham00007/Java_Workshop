import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClient {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            DatagramSocket clientSocket = new DatagramSocket();

            InetAddress serverAddress = InetAddress.getByName("localhost");
            int serverPort = 3000;

            System.out.print("Enter the message: ");
            String message = sc.nextLine();
            byte[] sendBuffer = message.getBytes();

            // Sending message to server
            DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, serverAddress, serverPort);
            clientSocket.send(sendPacket);

            

            clientSocket.close();
            sc.close();
        } catch (Exception e) {
            System.out.println("Error in client: " + e);
        }
    }
}
