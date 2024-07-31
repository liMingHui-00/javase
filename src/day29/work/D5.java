package day29.work;
import java.io.FileReader;
import java.io.IOException;
public class D5 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("aa/Eason.txt");
        char[] chars = new char[1024];
        int read;
        while ((read = fileReader.read(chars))!=-1){
            String s = new String(chars,0,read);
            System.out.print(s);
        }
    }
}
