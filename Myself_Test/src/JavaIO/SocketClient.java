package JavaIO;

import java.io.IOException;
import java.net.Socket;

public class SocketClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 9000);
        //�����˷�������
        socket.getOutputStream().write("HelloServer".getBytes());
        socket.getOutputStream().flush();
        System.out.println("�����˷������ݽ���");
        byte[] bytes = new byte[1024];
        //���շ���˻ش�������
        socket.getInputStream().read(bytes);
        System.out.println("���յ�����˵����ݣ�" + new String(bytes));
        socket.close();
    }
}
