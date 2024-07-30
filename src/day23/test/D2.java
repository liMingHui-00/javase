package day23.test;

public class D2 {
    public static void main(String[] args) {
        Integer integer = new Integer(1);
        int a = 1;
        System.out.println(a==integer);
        String s = "44";
        Integer integer1 = new Integer(s);
        System.out.println(integer1 + 1);
        int b= integer+1;
        integer = integer+a;
        String s2 = integer.toString();
        int compare = Integer.compare(5, 6);
        int compare2 = Integer.compare(6,6);
        System.out.println(compare2);
        System.out.println("----------------------");
        Integer integer2 = new Integer("55");
        System.out.println(integer2 + 5);
    }
}
