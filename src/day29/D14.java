package day29;

import java.io.FileReader;
import java.io.IOException;

public class D14 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("aa/ee.txt");
        char[] bytes = new char[1024];
        int read = 0;
        while ((read = fileReader.read(bytes))!=-1){
            String str = new String(bytes,0,read);
            System.out.println(str);
        }
        fileReader.close();

    }
}
