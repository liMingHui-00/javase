package day29;

import java.io.File;

public class D6 {
    public static void fn(File file){
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()){
                System.out.println(file1.getName());
            }else {
                fn(file);
            }
        }
    }
    public static File fn(String str){
        File file = new File(str);
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()){
                return file1;
            }else {
                fn(file1);
            }

        }
       return file;
    }
    public static void main(String[] args) {
        File file = new File("C:\\jetbra\\config-jetbrains");
            fn(file);
        System.out.println(fn("C:\\jetbra\\config-jetbrains"));
    }
}
