package day5.homework;

public class D3 {
    public static void main(String[] args) {
        for (int j = 9 ;j>=1;j--){
            for (int i = 1; i<=j;i++){
                System.out.printf(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
        for (int j = 9 ;j>=1;j--){

            for (int k = 1; k<=9-j;k++) {
            System.out.printf("\t\t");
        }
            for (int i = 1; i<=j;i++){
                System.out.printf(j+"*"+i+"="+i*j+"\t");
            }

            System.out.println();
        }
    }
}
