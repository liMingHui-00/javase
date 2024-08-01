package day30;

import java.io.*;

public class D10 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileInputStream = new FileOutputStream("aa/bm.txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileInputStream, "GB2312");
        String s = "加大监督";
        outputStreamWriter.write(s);
        outputStreamWriter.close();
        fileInputStream.close();
    }
}
