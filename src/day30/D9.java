package day30;

import java.io.*;

public class D9 {
    public static void main(String[] args) {
        try( FileInputStream fileInputStream = new FileInputStream("aa/dd/bm.txt");
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "GBK");) {
            char[] chars = new char[1024];
            int n= 0;
            while ((n=inputStreamReader.read(chars))!=-1){
                String s = new String(chars,0,n);
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
