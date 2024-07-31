package day29;

import java.io.File;

public class D4 {
    public static void main(String[] args) {
        File file = new File("aa/bb.txt");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getParent());
    }
}
