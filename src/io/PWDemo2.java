package io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 自行完成流连接的创建
 */
public class PWDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        //向文件中按行写入文本数据
        //1创建文件流(低级流，字节流):向文件中写入字节数据
        FileOutputStream fos = new FileOutputStream("pw2.txt");//如果希望对文件追加写，要在这里打开追加模式
        //2创建转换流(高级流，字符流):衔接字节与字符流，负责将写出的字符转换为字节
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);//若需要明确字符集，则应当在转换流上指定
        //3创建缓冲字符流(高级流，字符流):块写文本数据加速
        BufferedWriter bw = new BufferedWriter(osw);
        //4创建PrintWriter(高级流，字符流):按行写出字符串，自动行刷新
        PrintWriter pw = new PrintWriter(bw);

        /*
            实现简易记事本功能。
            将控制台上输入的每一行字符串都按行写入到文件里
            如果在控制台上单独输入exit,则程序退出。
         */
        Scanner scanner  = new Scanner(System.in);
        while(true){
            String line = scanner.nextLine();//获取用户在控制台输入的一行字符串
            if("exit".equals(line)){
                break;//如果用户输入的是退出，则停止循环
            }
            pw.println(line);
        }

        System.out.println("写出完毕");
        pw.close();
    }
}
