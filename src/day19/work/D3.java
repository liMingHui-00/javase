package day19.work;

import java.util.Scanner;

public class D3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你想要判断后缀名");
        String s = scanner.next();
        if (s.contains("bmp")||s.contains("jpg")||s.contains("jpeg")||s.contains("png")||s.contains("tiff")||s.contains("gif")){
            System.out.println("是图片");
        }else {
            System.out.println("不是图片");
        }
    }
}
