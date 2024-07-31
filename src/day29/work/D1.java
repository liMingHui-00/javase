package day29.work;

import java.io.File;

public class D1 {
    public static int  count(File file){
        int size =0;
        if (file.isDirectory()){
            File[] files = file.listFiles();
            if (files!=null){
                for (File listFile : files) {
                    size+=count(listFile);
                }
            }
        }else if (file.isFile()){
            size+=file.length();
        }
        return size;
    }
    public static void main(String[] args) {
        File file = new File("C:\\jetbra");
        System.out.println(count(file));
    }
}
