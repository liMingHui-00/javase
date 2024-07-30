package day4;

public class D14 {
    public static void main(String[] args) {
     int b [] = new int[4];
        System.out.println(b);
        System.out.println(b.length);
        for (int i = 0; i < b.length; i++) {
            b[i] = i;
            System.out.println(b[i]);
        }
        double d[] = new double[]{1,2,3,4};
        System.out.println(d[2]);
        char ch[] = {'a','b','c'}
                ;
        System.out.println(ch.length);
        String name[] = {"lisi","wangwu","mazi"};
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
            System.out.println('*');
        }
    }
}
