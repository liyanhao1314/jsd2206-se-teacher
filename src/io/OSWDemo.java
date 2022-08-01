package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * java IO将流按照读写数据的单位划分为字节与字符流
 * java.io.InputStream和OutputStream是所有字节流的超类，是抽象类。
 * java.io.Reader和Writer则是所有字符流的超类，是抽象类。
 * 字节流与字符流的超类互相不存在继承关系，是平级的。
 *
 * Reader中定义了几个read方法，规定所有字符流都必须具备的读取字符的方法
 * Writer中定义了几个write方法，规定了所有字符流都必须具备的写出字符的方法
 *
 *
 * 转换流
 * java.io.InputStreamReader和OutputStreamWriter
 * 实际开发中当我们进行流连接对文本数据读写时，这几乎是一套必不可少的高级流。但是在
 * 流连接中我们不会直接操作这两个流。
 */
public class OSWDemo {
    public static void main(String[] args) throws IOException {
        //向文件osw.txt中写入文本数据
        FileOutputStream fos = new FileOutputStream("osw.txt");
        /*
            字符流都是高级流
            转换流的其中一个作用就是将写出的字符转换为字节，然后再交给下面连接的字节流
            将数据写出
         */
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        /*
            字符输出流java.io.Writer中提供了直接写出字符串的方法:
            void write(String str)
         */
        String line = "super idol的笑容都没你的甜。";
        osw.write(line);
        osw.write("八月正午的阳光都没你耀眼。");

        System.out.println("写出完毕!");
        osw.close();


    }
}
