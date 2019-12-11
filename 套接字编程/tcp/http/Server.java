package tcp.http;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket tcpServerSocket = new ServerSocket(8080);
        Scanner scanner = new Scanner(System.in);
        while (true){
            Socket clientSocket = tcpServerSocket.accept();
            InetAddress clientAddress = clientSocket.getInetAddress();
            int clientPort = clientSocket.getPort();
            System.out.printf("有客户端连接上来 %s:%d%n",
                    clientAddress.getHostAddress(),clientPort);
            //获取字节流
            InputStream is = clientSocket.getInputStream();
            //字节流转换为字符流
            InputStreamReader isReader = new InputStreamReader(is,"UTF-8");
            //字符流转换缓冲字符流
            BufferedReader reader = new BufferedReader(isReader);

            //获取输出字节流
            OutputStream os = clientSocket.getOutputStream();
            PrintStream out = new PrintStream(os,true,"UTF-8");

            String line = reader.readLine();
            System.out.println("好友说:" + line);
            System.out.print("请回复>");
            String response = scanner.nextLine();
            out.println(response);

            clientSocket.close();
        }
    }
}
