package io;

import java.io.*;

/**
 * 使用缓冲流完成文件的复制操作
 *
 * JAVA IO将流分为两类:节点流和处理流(过滤流)
 * 节点流也称为低级流，特点:是实际连接程序与另一端的流，负责实际读写字节数据的流
 *                  读写一定是建立再节点流基础上进行的!!!
 * 处理流也称为高级流，特点:不能独立存在，必须连接在其他流上，目的是当数据经过当前
 *                  流时对其进行操作简化我们的读写。
 *
 * 实际开发中我们经常串联一组高级流最终到某个低级流上，读写数据可以以流水线式的
 * 加工处理完成复杂的读写。这个过程称为"流的连接"
 *
 * 文件流就是典型的低级流，是实际连接程序与文件的流，负责读写文件数据。
 *
 * 缓冲流:java.io.BufferedInputStream和BufferedOutputStream
 * 缓冲流是一对高级流，功能:提高读写效率。
 *
 */
public class CopyDemo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("01.rmvb");
        BufferedInputStream bis = new BufferedInputStream(fis);

        FileOutputStream fos = new FileOutputStream("01_cp.rmvb");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        int d;
        long start = System.currentTimeMillis();
        while((d = bis.read()) != -1){
            bos.write(d);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕，耗时："+(end-start)+"ms");

        bis.close();
        bos.close();
    }
}




