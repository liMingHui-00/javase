package day29;

import java.io.File;

public class D19 {
    public static int print(File file){
        int size = 0;
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()){
//                System.out.println(file1.getName()+"大小为"+file1.length());
                return size+=file1.length();
            }else {
                print(file1);
            }
        }
       return size;
    }
    public static void main(String[] args) {
        System.out.println(print(new File("aa")));
    }
}
