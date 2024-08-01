package day30;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class D2 {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("aa/bb.txt"));
        String msg = "很大很大哈就到家啊就是大家安静大会结束";
        bufferedOutputStream.write(msg.getBytes());
        bufferedOutputStream.close();
    }
}
