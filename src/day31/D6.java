package day31;

import java.io.*;

public class D6 {
    public static void qc(File fromFile,File toFile) {
        Thread thread = new Thread(){
            @Override
            public void run() {
                try {
                    FileInputStream fileInputStream  = new FileInputStream(fromFile);
                    FileOutputStream fileOutputStream  = new FileOutputStream(toFile);
                    int read;
                    while ((read = fileInputStream.read())!=-1) {
                        fileOutputStream.write(read);
                    }
                    fileOutputStream.close();
                    fileInputStream.close();
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            };
        thread.start();
        System.out.println("开启");
        };

    public static void main(String[] args) throws IOException {
        File from = new File("aa/bb/cc/dd");
        File to = new File("bb");
        File[] files = from.listFiles();
        for (File file : files) {
            if (file.isFile()){
//                qc(file,to);
            }
        }
    }
}
