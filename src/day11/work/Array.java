package day11.work;

/**
 * @Author：lmh
 * @Create: 2024-7-11 19:53
 */
public class Array {
    public void isOShu(int n) {
        if (n % 2 == 0) {
            System.out.println(n + "是偶数");
        } else {
            System.out.println(n + "不是偶数");
        }
    }

    public void getMax(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a + "是最大值");
        }
        if (b > a && b > c) {
            System.out.println(b + "是最大值");
        }
        if (c > b && c > a) {
            System.out.println(c + "是最大值");
        }
    }
    public  boolean oneToHo(int n){
        boolean flage = false;
        for (int i = 1; i <= 100; i++) {
            if (i==n){
                flage = true;
                break;
            }
        }
        return flage;
    }

    public int getSum(int a,int b){
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum +=i;
        }
        return sum;
    }
    public void  XX(int x){
        for (int i = 1; i <= x; i++) {
            for (int i1 = 1; i1 <= i; i1++) {
                System.out.print(i+"*"+i1+"="+i*i1+"\t");
            }
            System.out.println();
        }
    }
}
