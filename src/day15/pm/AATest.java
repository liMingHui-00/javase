package day15.pm;

/**
 * @Author：lmh
 * @Create: 2024-7-15 16:03
 */
public class AATest {
    public static void main(String[] args) {

        AA aa = new AA();
        System.out.println(aa.pub);
        System.out.println(aa.pro);
        System.out.println(aa.que);
        /*在同包不同类中  可以访问非私有的成员变量和成员方法*/
//        System.out.println(aa.pri);
    }
}
