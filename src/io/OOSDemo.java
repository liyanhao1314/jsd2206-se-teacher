package io;

/**
 * 对象流
 * java.io.ObjectInputStream和ObjectOutputStream
 *
 * 对象流的功能:进行对象序列化与反序列化
 * 对象序列化由对象输出流完成:将一个java对象按照其结构转换为一组字节的过程
 * 对象反序列化由对象输入流完成:将一组字节还原为一个java对象的过程
 *
 */
public class OOSDemo {
    public static void main(String[] args) {
        //将一个Person对象写入文件person.obj中
        String name = "刘桑";
        int age = 55;
        String gender = "男";
        String[] otherInfo = {"技术好","拍片儿一流","大家的启蒙老师"};
        Person p = new Person(name,age,gender,otherInfo);

    }
}
