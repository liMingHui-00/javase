package day7;

/**
 * ClassName: D9
 * Package: day7
 * Description：
 *
 * @Author：lmh
 * @Create: 2024-7-7 12:42
 */
public class D9 {
    public static void main(String[] args) {
        for (int g = 0; g <=20 ; g++) {
            for (int m = 0; m <= 33; m++) {
                int x = 100-g-m;
                if (g*5+m*3+x/3==100&&x%3==0){
                    System.out.println("公鸡"+g+"\t"+"母鸡"+m+"\t"+"小鸡"+x);
                }
            }

        }
    }
}
