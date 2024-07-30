package day4;
import java.util.Scanner;

public class D23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入您的身高（米）：");
        double height = scanner.nextDouble();
        System.out.print("请输入您的体重（公斤）：");
        double weight = scanner.nextDouble();
        double bmi = weight / (height * height);
        String category;
        if (bmi < 18.5) {
            category = "偏瘦";
        } else if (bmi < 24) {
            category = "正常";
        } else if (bmi < 28) {
            category = "偏胖";
        } else if (bmi < 30) {
            category = "肥胖";
        } else if (bmi < 40) {
            category = "重度肥胖";
        } else {
            category = "极重度肥胖";
        }
        System.out.printf("您的BMI值为：%.2f\n", bmi);
        System.out.println("您的身体状况属于：" + category);
    }
}
