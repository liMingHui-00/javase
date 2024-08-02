package day31;

import day30.work.D1;

import java.io.*;

public class D6 {
    public static void qc(File fromFile,File toFile) throws IOException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                FileInputStream fileInputStream = null;
                try {
                    fileInputStream = new FileInputStream(fromFile);
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
                FileOutputStream fileOutputStream = null;
                try {
                    fileOutputStream = new FileOutputStream(toFile);
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
                int read;
                while (true) {
                    try {
                        if (!((read = fileInputStream.read()) != -1)) break;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    try {
                        fileOutputStream.write(read);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
thread.start();

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
        File from = new File("aa");
        File to = new File("bb");
        File[] files = from.listFiles();
        for (File file : files) {
            File newToFile = new File(to,file.getName());
            if (file.isFile()){
                qc(file,newToFile);
            }else {
                files(file,newToFile);
            }
        }
    }
}
