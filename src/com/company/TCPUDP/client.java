package TCPUDP;
/*
 @saphrena
 @2022/1/24 024
 @Demo
*/


import java.io.IOException;
import java.net.*;
import java.util.Scanner;



public class client {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        while (true) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            if("886".equals(s)){
                break;
            }
            byte[] bytes = s.getBytes();
            InetAddress address = InetAddress.getByName("127.0.0.1");
            int port = 10000;
            DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,port);
            ds.send(dp);
        }
        ds.close();

    }
}
