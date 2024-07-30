package day24;

public class D10 {
    public static void main(String[] args) {
        String s = "hello";
        String t = "hello";
        StringBuffer sb1 = new StringBuffer("hello");
        StringBuffer sb2 = new StringBuffer("hello");
        System.out.println(sb2.equals(s));//false
        System.out.println(s.equals(sb2));//false
        char[] c = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(s.equals(t));//true
        System.out.println(sb1.equals(c));
    }
}
