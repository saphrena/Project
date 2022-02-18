package TCPUDP.Practice1;
/*
 @saphrena
 @2022/1/25 025
 @Demo
*/
//- 案例需求
//  客户端：数据来自于本地文件，接收服务器反馈
//  服务器：接收到的数据写入本地文件，给出反馈

//- 案例分析
//  - 创建客户端对象，创建输入流对象指向文件，每读一次数据就给服务器输出一次数据，输出结束后使用shutdownOutput()方法告知服务端传输结束
//  - 创建服务器对象，创建输出流对象指向文件，每接受一次数据就使用输出流输出到文件中，传输结束后。使用输出流给客户端反馈信息
//  - 客户端接受服务端的回馈信息

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",10000);
        //是本地的流,用来读取本地文件的.
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("\"socketmodule\\\\ClientDir\\\\1.jpg\""));

        //写到服务器 --- 网络中的流
        OutputStream os = socket.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(os);

        int b;
        while((b = bis.read()) !=-1){
            bos.write(b);//通过网络写到服务器中
        }
        bos.flush();
        //给服务器一个结束标记,告诉服务器文件已经传输完毕
        socket.shutdownOutput();

        //读反馈
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while((line = br.readLine()) !=null){
            System.out.println(line);
        }
        bis.close();
        socket.close();
    }
}
