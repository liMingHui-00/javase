package day29;

public class D15 {
    public static void main(String[] args) {
        int i = 0;
        long l = System.currentTimeMillis();
        long l2;
        while (true){
            i++;
            if (i>100000){
             l2 = System.currentTimeMillis();
                break;
            }
        }

        System.out.println(l2-l);
    }
}
