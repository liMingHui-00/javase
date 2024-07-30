package day22;

public class D4 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("QWERTUOOPHFDS");
        for (int i = 0; i < sb.length(); i++) {
            if (i%2==0){
                sb.replace(i,i+1,"*");
            }
        }
        System.out.println(sb.reverse());
        System.out.println(Math.E);
    }
}
