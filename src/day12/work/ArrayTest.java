package day12.work;

/**
 * @Author：lmh
 * @Create: 2024-7-12 20:15
 */
public class ArrayTest {
    public static void main(String[] args) {
        Array test1 = new Array();
        test1.isOuShu(10);
        double b[] ={5.1,3.9,8.9,6.7};
        double c[] = test1.jiangXu(b);
        for (double aa:c){
            System.out.println(aa);
        }
        int d[] = {1,10};
        System.out.println(test1.sumArr(d));

        System.out.println(test1.oneToOne(5, 6));
        int e[] = {5,6};
       int f[] =    test1.heBing(d,e);
       for (int aaa:f){
           System.out.println(aaa);
       }
    }
}
