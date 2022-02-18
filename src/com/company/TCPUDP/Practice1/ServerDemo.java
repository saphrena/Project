package TCPUDP.Practice1;
/*
 @saphrena
 @2022/1/25 025
 @Demo
*/

// 优化1：服务器只能处理一个客户端请求，接受完一个图片之后，服务器及就关闭了，
// 优化1：给 服务器 加个while循环（从accept到accept关闭），这样就可用处理多个客户端请求了

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);

        Socket accept = ss.accept();

        //网络中的流,从客户端读取数据的
        BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());
        //本地的IO流,把数据写到本地中,实现永久化存储
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("socketmodule\\ServerDir\\copy.jpg"));

        int b;
        while((b = bis.read()) !=-1){
            bos.write(b);
        }


        //写反馈
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        bw.write("上传成功");
        bw.newLine();
        bw.flush();

        bos.close();
        accept.close();
        ss.close();
    }
}
