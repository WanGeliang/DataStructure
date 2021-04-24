package JavaIO;

import java.io.IOException;
import java.net.Socket;
import java.net.ServerSocket;

public class SocketServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9000);
        while (true) {
            System.out.println("�ȴ����ӡ���");
            //��������
            Socket clientSocket = serverSocket.accept();
            System.out.println("�пͻ��������ˡ���");
//            handler(clientSocket);

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        handler(clientSocket);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }

    private static void handler(Socket clientSocket) throws IOException {
        byte[] bytes = new byte[1024];
        System.out.println(Thread.currentThread().getName()+"׼��read����");
        //���տͻ��˵����ݣ�����������û�����ݿɶ�ʱ������
        int read = clientSocket.getInputStream().read(bytes);
        System.out.println("read��ϡ���");
        if (read != -1) {
            System.out.println("���յ��ͻ��˵����ݣ�" + new String(bytes, 0, read));
        }
        clientSocket.getOutputStream().write("HelloClient".getBytes());
        clientSocket.getOutputStream().flush();
    }
}

