package day29;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class D10 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("aa/dd.txt",true);
        String msg = "还打啥数据库的哈德苦哈哈的哈哈的";
        byte[] bytes = msg.getBytes();
        fileOutputStream.write(bytes);
        FileInputStream fileInputStream = new FileInputStream("aa/dd.txt");
        byte[] bytes1 = new byte[1024];
        int read = fileInputStream.read(bytes1);
        while (read!=-1){
           String s = new String(bytes1,0,read);
            System.out.println(s);
            read = fileInputStream.read(bytes1);
        }
    }
}
