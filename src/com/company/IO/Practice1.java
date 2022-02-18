package IO;
//- 案例需求
//
//  ​	把“E:\\itcast\\mn.jpg”复制到模块目录下的“mn.jpg”  (文件可以是任意文件去)
//
//- 实现步骤
//
//  - 根据数据源创建字节输入流对象
//  - 根据目的地创建字节输出流对象
//  - 读写数据，复制图片(一次读取一个字节数组，一次写入一个字节数组)
//  - 释放资源


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Practice1 {

    public static void main(String[] args) throws IOException {
        //根据数据源创建字节输入流对象
        FileInputStream fis = new FileInputStream("E:\\itcast\\mn.jpg");
        //根据目的地创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("myByteStream\\mn.jpg");

        //读写数据，复制图片(一次读取一个字节数组，一次写入一个字节数组)
        byte[] bys = new byte[1024];
        int len;
        while ((len=fis.read(bys))!=-1) {
            fos.write(bys,0,len);
        }

        //释放资源
        fos.close();
        fis.close();
    }
}
