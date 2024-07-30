package day4;
import java.util.Scanner;
public class D7 {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        if (num>90){
            System.out.println("优秀");
        }else if (num>=60){
            System.out.println("及格");
        }else {
            System.out.println("不及格");
        }
    }
}
