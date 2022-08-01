package exception;
/*
    JAVA 异常处理机制
    JAVA中所有的异常的顶级超类为:Throwable
    而Throwable下面定义了两个子类型:Error和Exception
    Error:表示错误，不可挽回的。通常描述的都是系统错误
    Exception:表示异常，可在程序运行过程中被处理掉的。
    我们通常仅在异常处理机制中处理Exception

    异常处理机制中的：try-catch
    语法:
    try{
        可能出现异常的代码片段
    }catch(XXXException e){
        处理try中出现XXXException的代码
    }

 */
public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try {//try语句块不能单独写，后面必须跟上catch或finally块
            String str = null;
            System.out.println(str.length());//JVM会实例化对应异常抛出
        }catch(NullPointerException e){//e就接受(捕获到)到24行这里出现的空指针异常实例
            //针对该异常的解决办法(B计划)，实际要结合业务需求去处理
            System.out.println("出现了空指针，并解决了");
        }

        System.out.println("程序结束了");
    }
}
