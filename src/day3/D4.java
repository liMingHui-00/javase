package day3;

public class D4 {
    public static void main(String[] args) {
        int a = 3;
//        int b = ++a + a++ + ++a;
//        System.out.println(b);
        int c = ++a + a-- + --a + a++;
//              4      4      2   2
        int d = a++ + a++ + a++ +a;
//              3      4     5    6
        System.out.println(d);
        int dd = 44;
        int cc = 45;
        System.out.println(dd > cc);
        System.out.println(dd < cc);
        System.out.println(dd != cc);
        System.out.println(dd == cc);
        System.out.println("*************************");
        int aaa  = 10;
        int bbb = 8;
        int ccc = 4;
        boolean x = aaa*3>bbb*ccc && aaa-1 == bbb++;
        System.out.println(x);

    }
}
