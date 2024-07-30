package day3;
import java.util.Scanner;

public class D23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        if (p<=3){
            System.out.println("需要1间房间");
        }
        if (p>3 && p%3!=0){
            System.out.println("需要"+(p/3+1)+"间");
        }
        if (p%3==0){
            System.out.println("需要"+(p/3)+"间");
        }

    }
}
