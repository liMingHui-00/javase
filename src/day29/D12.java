package day29;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class D12 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("aa/bb.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("aa/ee.txt");
        byte  b[]  =  new byte[1024];
        int   read  =  0;
        while ((read=fileInputStream.read(b))!=-1){
            fileOutputStream.write(b,0,read);
        }
        fileOutputStream.close();
        fileInputStream.close();
    }
}
