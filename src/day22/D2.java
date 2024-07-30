package day22;

public class D2{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("13785412254554");
//        System.out.println(sb.substring(3, 5));
//        System.out.println(sb.charAt(sb.length() - 1));
//        System.out.println(sb.length());
//        System.out.println(sb.lastIndexOf("0"));
        System.out.println(sb.insert(0, "000"));
        System.out.println(sb.delete(0, 2));
        System.out.println(sb.deleteCharAt(0));
        System.out.println(sb.replace(0, sb.length(), "*"));
        System.out.println(sb.reverse());

    }
}
