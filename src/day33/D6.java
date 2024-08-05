package day33;

import java.io.FileOutputStream;
import java.io.IOException;

public class D6 {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("aa/dd/d.txt");
      file.write("大家好的哈哈镜就".getBytes());
      file.write("56655665".getBytes());
    }
}
