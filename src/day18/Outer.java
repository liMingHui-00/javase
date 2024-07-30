package day18;

/**
 * @Author：lmh
 * @Create: 2024-7-18 11:18
 */
public class Outer {
    public String name ="lisi";

    public static void st(){
        System.out.println("我是外部类的static方法");
    }
    public void aa(){
        System.out.println("我是外部类的普通方法");
    }
    {
        System.out.println("我是外部类的代码块");
    }
    static {
        System.out.println("外部类的静态代码块");
    }
    public class Inner{
        private int age;
        String name = "wangwu";
//        static String sex;  不能使用static
{
    System.out.println("内部类的代码块");
}
public void cc(){
    System.out.println("内部类的普通方法");
    System.out.println(Outer.this.name);
    System.out.println(name);

}
    }
}
