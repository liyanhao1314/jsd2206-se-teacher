package io;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * 缓冲字符输入流
 * 特点:1,块读文本数据加速
 *     2,可以按行读取字符串
 */
public class BRDemo {
    public static void main(String[] args) throws IOException {
        //将当前源程序输出到控制台上
        FileInputStream fis = new FileInputStream(
                "./src/io/BRDemo.java"
        );
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        /*
            BufferedReader提供了一个方法:
            String readLine()
            该方法可以读取一行字符串。
         */
        String line = br.readLine();
        System.out.println(line);

        br.close();
    }
}
