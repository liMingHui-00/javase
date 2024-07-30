package day18;

public class SumTest {
    public static void main(String[] args) {
        Sum sum = (a,b)->a+b;
        int s = sum.sum(10,20);
        System.out.println(s);
    }
}
