package day23.test;

public class D4 {
    public static void main(String[] args) {
//        string-->int
        String str = "123";
        int a = Integer.parseInt(str);
//        int --> string
        String b = a+"";
        b = String.valueOf(a);
        b = Integer.toString(a);
        boolean b1 = b.isEmpty();
        System.out.println(b1);
    }
}
