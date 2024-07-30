package day4;
import java.util.Scanner;
public class D6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();
        if (n>=1 && n<100){
            if (n%7==0 || n%10 ==7 || n/10 ==7){
                System.out.println("过");
            }
        }else {
            System.out.println("输入的数字不对");
        }
    }
}
