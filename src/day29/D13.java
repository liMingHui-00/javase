package day29;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class D13 {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("aa/bb.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int i ;
        while (true){
            try {
                if ((i = fileReader.read()) == -1) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println((char) i);
        }
        try {
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
