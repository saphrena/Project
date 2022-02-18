package TCPUDP.Practice;
/*
 @saphrena
 @2022/1/25 025
 @Demo
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
// - 案例需求
//   客户端：发送数据，接受服务器反馈
//   服务器：收到消息后给出反馈

//- 案例分析
//  - 客户端创建对象，使用输出流输出数据
//  - 服务端创建对象，使用输入流接受数据
//  - 服务端使用输出流给出反馈数据
//  - 客户端使用输入流接受反馈数据
public class clientDemo {
    public static void main(String[] args) throws IOException, IOException {
        Socket socket = new Socket("127.0.0.1",10000);
        OutputStream os = socket.getOutputStream();
        os.write("hello".getBytes());
        // os.close();如果在这里关流,会导致整个socket都无法使用
        socket.shutdownOutput();//仅仅关闭输出流.并写一个结束标记,对socket没有任何影响

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while((line = br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
        os.close();
        socket.close();
    }
}
