package day16;

/**
 * @Author：lmh
 * @Create: 2024-7-16 16:38
 */
public class SS extends FF{

    public SS() {
        super();
        System.out.println("无参");
    }

    public SS(int age, String name) {
        super(age, name);
    }

    public static void main(String[] args) {
        SS ss = new SS(12,"lll");
//        SS ss1 = new SS();
//        System.out.println(ss.getAge());
//        System.out.println(ss.getName());
    }
}
