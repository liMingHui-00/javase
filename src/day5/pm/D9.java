package day5.pm;
public class D9 {
    public static void main(String[] args) {
//        int a = 1;
//        while (a<=9) {
//            int b = 1;
//            while (b <= a) {
//                System.out.printf(a+"*"+b+"="+a*b+"\t");
//                b++;
//            }
//            System.out.println();
//            a++;
//        }
        int a =1;
        while (a<=9) {
            for (int b = 1;b<=a;b++){
                System.out.printf(a+"*"+b+"="+a*b+"\t");
            }
            System.out.println();
            a++;
        }
    }
}