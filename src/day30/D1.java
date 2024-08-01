package day30;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class D1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("aa/Eason.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        byte[] bytes = new byte[1024];
        int i;
        while ((i = bufferedInputStream.read(bytes))!=-1){
            String msg = new String(bytes,0,i);
            System.out.println(msg);
        }
        bufferedInputStream.close();
        fileInputStream.close();
    }
}
