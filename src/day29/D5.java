package day29;

public class D5 {
    public static void pr(int num){
        System.out.println(num);
        if (num==100){
            return;
        }
        pr(num+1);
    }
    public static int p(int n){
        if (n==1){
            return 1;
        }
        return n+p(n-1);
    }
    public static void main(String[] args) {
//        pr(90);
        System.out.println(p(100));
    }
}
