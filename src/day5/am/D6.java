package day5.am;

public class D6 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
//            System.out.println("swk"+i);
        }
        int s = 0;
        for (int i = 0; i < 100; i++) {
            if (i%2==0){
                s += i;
//                System.out.println(s);
            }
        }
        for (int i = 10; i >0; i--) {
//            System.out.println(i);
        }
        for (int i = 10; i < 110; i=i+2) {
//            System.out.println(i);
        }
        for (int i = 1; i <= 10; i++) {
            for (int i1 =1; i1 <= i ; i1++) {
//                System.out.print(i1+"X"+i+"="+i1 * i+"\t");
            }
//            System.out.println("");
        }
        for (int i = 1; i <= 9; i++) {
            for (int i1 = 9; i1 >=i; i1--) {
                System.out.print(i+"X"+i1+"="+i * i1+"\t");
//
            }
            System.out.println("");
        }
    }
}
