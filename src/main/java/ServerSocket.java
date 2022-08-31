import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ServerSocket {
    
    private static Integer port;

    public static void main(String[] args) throws SocketException {
        DatagramSocket socket = new DatagramSocket(port);

        DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
//        socket.send(packet);
        socket.close();
    }
}
