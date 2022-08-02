package exception;

/**
 * 异常的抛出
 */
public class ThrowDemo {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(1000);//满足语法,但是不满足业务
        System.out.println("此人年龄"+p.getAge()+"岁");
    }
}
