package day33;

import java.io.File;

public class D4 {
    public static long getsize(File file){
        File[] files = file.listFiles();
        long size =0;
        for (File file1 : files) {
            if (file1.isFile()){
                size+=file1.length();
            }else {
                size+= getsize(file1);
            }
        }
        return size;
    }
    public static void main(String[] args) {
        long aa = getsize(new File("aa"));
        System.out.println(aa);

    }
}
