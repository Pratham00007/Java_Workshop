import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static void main(String[] args) {
        try {
            DatagramSocket serverSocket = new DatagramSocket(3000);
            byte[] receiveBuffer = new byte[1024];
            byte[] sendBuffer;


            while (true) {
                // Receiving data from client
                DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
                serverSocket.receive(receivePacket); 

                String clientMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println( clientMessage);

                
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
