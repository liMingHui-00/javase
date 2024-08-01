package day30;

import java.io.*;

public class D5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("aa/Eason.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("aa/a.txt"));
        String s ;
        while ((s = bufferedReader.readLine())!=null){
            bufferedWriter.write(s);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        bufferedReader.close();
    }
}
