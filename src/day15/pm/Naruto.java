package day15.pm;

/**
 * @Author：lmh
 * @Create: 2024-7-15 15:31
 */
public class Naruto {
    {
        System.out.println("代码块1");
    }
/*
*           静态代码块使用static修饰，普通代码快没有
*           在创建对象时，先执行静态代码块，然后在执行普通代码块
*           静态代码块只在第一次创建对象时执行这一次，以后再创建对象就不再执行
*       而普通代码块在每一次创建对象时都会执行
* */
    static  {
        System.out.println("静态代码快1");
    }
    {
        System.out.println("代码块2");
    }
    static {
        System.out.println("静态代码块2");
    }
     static String name;
    public static void msg(){
        System.out.println(name);
    }
    public void msg2(){
        System.out.println(name);
        msg();
    }
    public static void main(String[] args) {
        Naruto.name = "lisi";
        Naruto naruto = new Naruto();
        Naruto naruto2 = new Naruto();
        //naruto2.msg2();
        naruto2.msg();

    }
}
