package day30;

import java.io.*;

public class D4 {
    public static void copyByBuffer(String from,String to) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(from));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(to));
        byte[] bytes = new byte[1024];
        int i ;
        while ((i = bufferedInputStream.read(bytes))!=-1){
            bufferedOutputStream.write(bytes,0,i);
        }
        bufferedOutputStream.close();
        bufferedInputStream.close();
    }
    public static void copy(String from,String to) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(from);
        FileOutputStream fileOutputStream = new FileOutputStream(to);
        byte[] bytes = new byte[1024];
        int i ;
        while ((i = fileInputStream.read(bytes))!=-1){
            fileOutputStream.write(bytes,0,i);
        }
        fileOutputStream.close();
        fileInputStream.close();
    }
    public static void main(String[] args) throws IOException {
        long startime = System.currentTimeMillis();
        copyByBuffer("aa/a.mp4","aa/bb/a.mp4");
        long endtime = System.currentTimeMillis();
        System.out.println(endtime-startime);
        long l = System.currentTimeMillis();
        copy("aa/a.mp4","aa/cc/a.mp4");
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);
    }
}
