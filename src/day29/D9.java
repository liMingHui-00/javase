package day29;

import java.io.FileInputStream;
import java.io.IOException;

public class D9 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("aa/cc.txt");
        byte b[] = new byte[9];
        int read = fileInputStream.read(b);
        while (read!=-1){
            String s = new String(b,0,read);
            System.out.println(s);
            read = fileInputStream.read(b);
        }
        fileInputStream.close();
    }
}
