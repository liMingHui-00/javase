package day5.pm;
public class D5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int i1 = 1; i1 <= i; i1++) {
                System.out.print(i1+"*"+i+"="+i1*i);
                System.out.print("\t");
            }
            System.out.println("");
        }
    }
}