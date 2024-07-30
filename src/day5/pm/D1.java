package day5.pm;
public class D1 {
    public static void main(String[] args) {
        int count  = 0;
        for (int i = 1; i <= 100; i++) {
            if (i %10 ==7 || i/10==7 || i %7 ==0){
                System.out.println("过");
                count++;
            }else {
                System.out.println(i);
            }
        }
        System.out.println( "一共"+count);

    }
}