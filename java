import java.net.*;
import java.io.*;

class TCPServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);

        Socket s = ss.accept();

        DataInputStream dis = new DataInputStream(s.getInputStream());

        String msg = dis.readUTF();

        System.out.println("Client: " + msg);

        dis.close();
        s.close();
        ss.close();
    }
}
