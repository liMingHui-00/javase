package day30;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class D8 {
    public static void main(String[] args) {
        try( FileInputStream fileInputStream = new FileInputStream("aa/qq.txt");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            System.out.println(objectInputStream.readUTF());
            System.out.println(objectInputStream.readInt());
            System.out.println(objectInputStream.readBoolean());
            System.out.println(objectInputStream.readObject());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
