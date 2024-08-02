package day32;

public class D1 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 200; i++) {
            System.out.println(i);
            Thread.sleep(50);
        }
    }
}
