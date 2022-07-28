package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 向文件中写入文本数据
 */
public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
        //向文件fos.txt中写入字符串
        FileOutputStream fos = new FileOutputStream("fos.txt");
        String line = "爱你孤身走暗巷";
        /*
            String提供的方法:
            byte[] getBytes(Charset charset)
            将当前字符串按照指定的字符集转换为一组字节
         */
        byte[] data = line.getBytes(StandardCharsets.UTF_8);
        fos.write(data);
        System.out.println("写出完毕!");
        fos.close();

    }
}
