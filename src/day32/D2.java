package day32;

public class D2 {
    public static void main(String[] args) {
        Thread thread = new Thread("task1") {
            @Override
            public void run() {
//                        打印水仙花
                int a, sum;
                int g, s, b;//分别表示百位、十位、各位
                for (a = 100; a <= 999; a++) {
                    g = a %10;
                    s = a/10%10;
                    b = a /100;
                    sum = g * g * g + s * s * s + b * b * b;
                    if (sum == a) {
                        System.out.println(sum);
                    }
                }
            }
        };
        for (int i = 0; i < 100; i++) {
            if (i==66){
                thread.start();
            }
        }
    }
}
