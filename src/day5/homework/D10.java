package day5.homework;

public class D10 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
//            3  2  1
            for (int x = 1 ;x<5-i;x++){
                System.out.print(" ");
            }

            for (int j = 1; j <2*i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
