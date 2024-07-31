package day29.work;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class D4 {
    public static void main(String[] args) throws IOException {
        FileReader fr1 = new FileReader("aa/a.txt");
        FileReader fr2 = new FileReader("aa/b.txt");
        FileReader fr3 = new FileReader("aa/c.txt");
        FileWriter fw = new FileWriter("aa/d.txt",true);
        char[] chars = new char[1024];
        int read1,read2,read3;
        while ((read1 = fr1.read(chars))!=-1){
            fw.write(chars,0,read1);
        }
        while ((read2 = fr2.read(chars))!=-1){
            fw.write(chars,0,read2);
        }
        while ((read3 = fr3.read(chars))!=-1){
            fw.write(chars,0,read3);
        }
        fw.close();
        fr3.close();
        fr2.close();
        fr1.close();
        File file1 = new File("aa/a.txt");
        File file2 = new File("aa/b.txt");
        File file3 = new File("aa/c.txt");
        file1.delete();
        file2.delete();
        file3.delete();
    }
}
