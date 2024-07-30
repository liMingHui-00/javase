package day28;

import java.io.File;

public class D3 {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\李明辉\\Desktop\\a.txt");
        String parent  ="C:\\Users\\李明辉\\Desktop";
        String parent2  ="C:\\Users\\李明辉\\Desktop";
        String son = "a.txt";
        String son2 = "a.txt";
//        File f2 = new File(parent, son);
        File f3 = new File(parent2, "a.txt");
        File f4 = new File("C:\\Users\\李明辉\\Desktop", son2);
        System.out.println(f4);

//        System.out.println(f3);
//        System.out.println(f1);
    }
}
