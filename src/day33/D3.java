package day33;

import java.io.File;
import java.io.IOException;

public class D3 {
    public static void main(String[] args) throws IOException {
        File file = new File("aa/dd");
        file.mkdirs();
        File file1 = new File(file, "a.txt");
        file1.createNewFile();
    }
}
