package day6;

public class D2 {
    public static void main(String[] args) {
        int x = 1234;
//        反过来的结果
        int n =0 ;
//        临时变量保存x原先的值
        int temp = x;
        while (x!=0) {
            int g = x%10;
//            拿到一位后修改x的值
            x = x /10;
             n = n*10+g;
        }
        System.out.println(n==temp?+temp+":回文数":+temp+":不是回文数");


    }
}
