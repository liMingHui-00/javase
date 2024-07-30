package day7;

public class D1 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i < 11; i++) {
            int a = 1;
            for (int i1 = 1; i1 <= i; i1++) {
                a=a*i1;
            }
            sum=sum+a;
        }
        System.out.println(sum);

    }
}
