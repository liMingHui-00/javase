package day5.pm;

public class D3 {
    public static void main(String[] args) {
        int n = 0;
        for (int i = 1; i <=100; i++) {
            if ( i%9==0 || i/10==9 || i%10 == 9 ) {
                n = n +i;
            }
        }
        System.out.println(n);
    }
}
