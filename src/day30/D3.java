package day30;

import java.io.File;

public class D3 {
    public static void copy(String from,String to){

    }
    public static void main(String[] args) {
        File file = new File("aa");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }
    }
}
