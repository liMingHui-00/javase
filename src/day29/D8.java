package day29;

import java.io.FileReader;
import java.io.IOException;

public class D8 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("aa/bb.txt");
        int read = fileReader.read();
        while (read!=-1){
            System.out.println((char) read);
            read = fileReader.read();
        }
        fileReader.close();
    }
}
