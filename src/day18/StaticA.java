package day18;

/**
 * @Author：lmh
 * @Create: 2024-7-18 11:41
 */
public class StaticA {
    int age =11;
    static int aaa=55;
    public static void a(){
        System.out.println("外部类的静态方法");
    }
    public void aa(){
        System.out.println("外部类的普通方法");
    }
    public static class B{
        static String name="静态内部类";
        public static void b(){
            System.out.println("内部类的静态方法");
        }
        public void bb(){
//            System.out.println(age);
            a();
            System.out.println(aaa);
        }
    }
}
