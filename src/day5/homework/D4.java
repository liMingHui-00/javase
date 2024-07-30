package day5.homework;

public class D4 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i <= 999; i++) {
            int g = i%10;
            int s = i/10%10;
            int b = i /100;
            if (g*g*g+s*s*s+b*b*b==i){
                count++;
            }
        }
        System.out.println(count);
    }
}
