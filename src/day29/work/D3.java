package day29.work;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class D3 {
    public static void copyVideoBySimple(String fromPath,String toPath) throws IOException {
        long startTime = System.currentTimeMillis();
        FileInputStream fileInputStream = new FileInputStream(fromPath);
        int read;
        FileOutputStream fileOutputStream = new FileOutputStream(toPath);
        while ((read=fileInputStream.read())!=-1){
            fileOutputStream.write(read);
        }
        long endTime = System.currentTimeMillis();
        fileOutputStream.close();
        fileInputStream.close();
        System.out.println("单个字节拷贝视频花费时间："+((endTime-startTime)/1000)+"秒");
    }
    public static void copyVideoByByte(String fromPath,String toPath) throws IOException {
        long startTime = System.currentTimeMillis();
        FileInputStream fileInputStream = new FileInputStream(fromPath);
        FileOutputStream fileOutputStream = new FileOutputStream(toPath);
        byte[] bytes = new byte[1024];
        int i;
        while ((i = fileInputStream.read(bytes))!=-1){
            fileOutputStream.write(bytes,0,i);
        }
        fileOutputStream.close();
        fileInputStream.close();
        long endTime = System.currentTimeMillis();
        System.out.println("通过数组拷贝视频花费时间："+(endTime-startTime));
    }
    public static void main(String[] args) throws IOException {
        copyVideoBySimple("C:\\Users\\李明辉\\Desktop\\a.mp4","aa/a.mp4");
        copyVideoByByte("C:\\Users\\李明辉\\Desktop\\a.mp4","aa/aa.mp4");
    }
}
