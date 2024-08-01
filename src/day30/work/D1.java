package day30.work;

import java.io.*;

public class D1 {
    public static void copy(File from,File to) throws IOException {
        if (!to.exists()){
            to.getParentFile().mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(from);
        FileOutputStream fileOutputStream = new FileOutputStream(to);
        byte[] bytes = new byte[1024];
        int read ;
        while ((read = fileInputStream.read(bytes))!=-1){
            fileOutputStream.write(bytes,0,read);
           }
                fileInputStream.close();
                fileOutputStream.close();
    }
    public static void files(File from,File to) throws IOException {
       if (!to.exists()){
           to.mkdirs();
       }
        File[] files = from.listFiles();
        for (File file : files) {
            File newTargetFile = new File(to, file.getName());
            if (file.isFile()){
                D1.copy(file,newTargetFile);
            }else if (file.isDirectory()){
                files(file,newTargetFile);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        File from = new File("aa/bb");
        File to = new File("aa/cc");
        files(from,to);
    }
}
