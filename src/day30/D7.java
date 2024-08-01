package day30;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class D7 {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("aa/qq.txt");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            boolean b = objectInputStream.readBoolean();
            System.out.println(b);
            Object object = objectInputStream.readObject();
            System.out.println(object);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
