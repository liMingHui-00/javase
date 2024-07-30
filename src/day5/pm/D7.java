package day5.pm;

public class D7 {
    public static void main(String[] args) {
        for (int i = 1 ; i<= 9 ; i ++ ){
            for (int k = 1 ;k<=9-i;k++){
                System.out.printf("\t\t");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println("");
        }

    }
}
