package day29.work;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class D2 {
    public static void copy(String from,String to){
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(from);
            FileOutputStream fileOutputStream = new FileOutputStream(to);
            int read;
            byte[] bytes = new byte[1024];
            while ((read=fileInputStream.read(bytes))!=-1){
                fileOutputStream.write(bytes);
            }
            fileOutputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        copy("C:\\Users\\李明辉\\Desktop\\新建文件夹 (2)\\__MACOSX\\法罗群岛36.JPG","aa/a.jpg");
    }
}
