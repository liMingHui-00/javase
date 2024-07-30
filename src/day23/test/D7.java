package day23.test;

public class D7 {
    public static void main(String[] args) {
        String a = "qwewqer124534ZXCQWV";
        int num = 0;
        int xnum = 0;
        int dnum = 0;
        for (int i = 0; i < a.length(); i++) {
        if ( Character.isDigit(a.charAt(i))){
            num++;
        }
        if ( Character.isLowerCase(a.charAt(i))){
            xnum++;
        }
        if ( Character.isUpperCase(a.charAt(i))){
            dnum++;
        }
    }
        System.out.println(num);
        System.out.println(xnum);
        System.out.println(dnum);
    }
}
