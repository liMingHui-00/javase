package day15.pm;

/**
 * @Author：lmh
 * @Create: 2024-7-15 16:01
 */
public class AA {
    public  String pub;
    protected String pro;
    String que;
    private  String pri;

    public static void main(String[] args) {
        AA aa = new AA();
        System.out.println(aa.pub);
        System.out.println(aa.pro);
        System.out.println(aa.que);
        System.out.println(aa.pri);
        /*在同包同类中  可以访问所有的成员变量和成员方法*/
    }
}
