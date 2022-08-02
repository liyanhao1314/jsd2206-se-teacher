package exception;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * JDK7之后推出了一个新的特性:自动关闭特性
 *
 */
public class AutoCloseableDemo {
    public static void main(String[] args) {
        /*
            自动关闭特性是编译器认可的,而非虚拟机.编译器在编译的时候回将代码改为FinallyDemo2的样子
         */
        try(
                FileOutputStream fos = new FileOutputStream("fos.dat");
        ){
            fos.write(1);
        }catch(IOException e){
            System.out.println("出错了");
        }
    }
}
