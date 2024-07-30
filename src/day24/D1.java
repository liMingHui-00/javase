package day24;

public class D1 {
    public static void main(String[] args) {
        String s = "a585sds4545";
        String reg = "^[a-zA-Z0-9]{6,}$";
        System.out.println(s.matches(reg));
        String sfz ="123456789101211314";
//        String sfzreg = "^[1-9]{17}[0-9X]{1}$";
         String sfzreg = "(^\\d{15}$)|(^\\d{17}([0-9]|X)$)";
        System.out.println(sfz.matches(sfzreg));
    }
}
