package day5.homework;

public class D2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            int s = 1;
            for (int j = 1; j <= i; j++) {
            s= s*j;
            }
            sum=sum+s;
        }
        System.out.println(sum);
    }
}
