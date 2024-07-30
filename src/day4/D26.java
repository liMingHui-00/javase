package day4;
import java.util.Scanner;
public class D26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入考试成绩：");
        int score = scanner.nextInt();
        if (score == 100) {
            System.out.println("恭喜！您获得了一架航拍遥控飞机！");
        } else if (score >= 90 && score <= 99) {
            System.out.println("恭喜！您获得了游乐场玩一次的机会！");
        } else if (score >= 80 && score <= 89) {
            System.out.println("恭喜！您获得了玩具赛车一辆！");
        } else if (score >= 70 && score <= 79) {
            System.out.println("恭喜！您获得了玩手机30分钟的机会！");
        } else {
            System.out.println("您的成绩低于70分，挨揍一顿。");
        }
    }
}
