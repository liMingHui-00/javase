package day34;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class D7 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        File file = new File("qwe");
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()){
                executorService.submit(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            FileInputStream fi = new FileInputStream(file1);
                            FileOutputStream fo = new FileOutputStream(new File("ert",file1.getName()));
                            int read;
                            while ((read = fi.read())!=-1){
                                fo.write(read);
                            }
                            fo.close();
                            fi.close();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                });
                executorService.shutdown();
            }
        }
    }
}
