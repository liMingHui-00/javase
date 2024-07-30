package day19.work;

import java.util.Scanner;

public class D6 {
    public static void main(String[] args) {
        String s [] ={"性","色情","爆炸","恐怖","枪"};
        System.out.println("请输入你想说的话");
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        for (int i = 0; i < s.length; i++) {
            String xg ="";
            for (int j = 0; j < i; j++) {
                xg+="*";
            }
            s1 = s1.replace(s[i],xg);
        }
        System.out.println("替换后的结果为");
        System.out.println(s1);
    }
}
