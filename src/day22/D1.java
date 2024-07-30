package day22;

public class D1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(1);
        sb.append(1);
        sb.append("555");
        sb.append(true);
        sb.append(1.1);
        sb.append("  55  ");
        System.out.println(sb);
        System.out.println("容量"+sb.capacity());
        System.out.println("长度"+sb.length());
    }
}
