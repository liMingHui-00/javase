package day5.pm;
public class D6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+"*"+j+"="+j*i+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 9; i >= 1; i--) {
            for (int i1 = 1; i1 <= i; i1++) {
                System.out.print(i+"*"+i1+"="+i1*i+"\t");
            }
            System.out.println("");
        }
        System.out.println("");

        for (int i = 1; i <= 9; i++) {
            for (int k = 1; k <=9-i ; k++) {
            System.out.printf("\t\t");
        }
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println("");
        }

        System.out.println();
        for (int i = 9; i >= 1; i--) {
            for (int k = 1; k <=9 - i ; k++) {
                System.out.printf("\t\t");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println("");
        }
    }
}