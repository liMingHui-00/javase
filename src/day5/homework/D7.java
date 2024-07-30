package day5.homework;

public class D7 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i%10==3||i/3==10){
            }else {
             System.out.print(i+" ");
             count++;
             if (count%5==0){
                 System.out.println();
             }
            }
        }
    }
}
