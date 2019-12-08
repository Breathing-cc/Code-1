package udp.echo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
    public static void main(String[] args) throws IOException {
        DatagramSocket udpClientSocket = new DatagramSocket();
        String message = "收到我消息没";
        byte[] sendBuffer = message.getBytes("UTF-8");
        byte[] serveIP = new byte[4];
        //127.0.0.1
        serveIP[0] = (byte)127;
        serveIP[1] = (byte)0;
        serveIP[2] = (byte)0;
        serveIP[3] = (byte)1;
        InetAddress serverAddress = InetAddress.getByAddress(serveIP);
        DatagramPacket sendPacket = new DatagramPacket(
                sendBuffer,
                sendBuffer.length,
                serverAddress,
                9897
        );
        udpClientSocket.send(sendPacket);

        //接受对方回应的消息
        byte[] receiveBuffer = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(
                receiveBuffer,receiveBuffer.length);
        udpClientSocket.receive(receivePacket);
        String responseMessage = new String(
                receivePacket.getData(),
                0,
                receivePacket.getLength(),
                "UTF-8"
        );
        System.out.println(responseMessage);

        udpClientSocket.close();
    }
}
