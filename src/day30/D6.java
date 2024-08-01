package day30;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class D6 {
    public static void main(String[] args){
        try( FileOutputStream fileOutputStream = new FileOutputStream("aa/qq.txt");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeBoolean(true);
            Student student = new Student("王五", 99);
            objectOutputStream.writeObject(student);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
