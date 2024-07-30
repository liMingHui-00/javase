package day6;

public class D3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int x = i;
//            定义记录原先x的值
                int temp = x;
                int n = 0;
            while (x != 0) {
                int ge = x%10;
//                向左移动位数
                x = x/10;
                n = n*10+ge;
            }
if (temp==n){
    System.out.println(temp);
}
        }
    }
}
