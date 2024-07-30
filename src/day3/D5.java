package day3;

public class D5 {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        System.out.println( ! b1); // f
        System.out.println(b1 | b2);// t
        System.out.println(b1 & b2);// f
        System.out.println(b1 ^ b2);// t
        System.out.println(b1 &&  b2);//f
        System.out.println(b1 || b2);//t
    }
}
