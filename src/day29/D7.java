package day29;

import java.io.FileInputStream;
import java.io.IOException;

public class D7 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("aa/bb.txt");
        int read = fileInputStream.read();
        while (read!=-1) {
            System.out.println((char) read);
             read = fileInputStream.read();
        }
    }
}
