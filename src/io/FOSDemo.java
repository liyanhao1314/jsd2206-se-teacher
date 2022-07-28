package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * JAVA IO 输入与输出  Input和Output
 * java将读写功能按照方向划分为输入与输出:
 * 输入负责读取，是从外界进入到我们的程序的方向
 * 输出负责写出，是从我们的程序到外界的方向
 *
 * java将IO比喻为是"流"，英文是:Stream
 * 像水流一样，我们向着同一侧方向顺序移动的过程，只不过在java io中我们的流是字节流，流动的是
 * 字节。
 * 而这里JAVA的IO流可以想象为是连接我们程序与另一端的"管道"，内部向着同一侧方向顺序移动字节。
 *
 * java.io.InputStream和OutputStream是所有字节输入与输出流的超类，本身是抽象类，不可以
 * 实例化，里面定义了基本的读写字节的相关方法。
 *
 *
 * 文件流
 * java.io.FileInputStream和FileOutputStream
 * 文件流是连接文件与程序的管道，负责对文件进行读写的流。
 * java.io.FileInputStream继承自InputStream，里面定义了读取字节的相关方法。
 * java.io.FileOutputStream继承自OutputStream，里面定义了写出字节的相关方法。
 */
public class FOSDemo {
    public static void main(String[] args) throws FileNotFoundException {
        //向当前项目目录中的文件fos.dat中写入字节数据
        //上述需求中的关键词：文件，写  应当使用文件输出流。
        FileOutputStream fos = new FileOutputStream("./fos.dat");//alt+回车  选择Add exception....


    }
}
