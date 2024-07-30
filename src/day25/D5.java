package day25;

public class D5 {
    public static  <F> void getBB(F bb){
        System.out.println(bb);
    }

    public static void main(String[] args) {
        D5.getBB(55+9);
        D5.<String>getBB("55"+1);
    }
}
