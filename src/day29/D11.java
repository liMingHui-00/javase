package day29;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class D11 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("aa/bb.txt");
        Scanner scanner = new Scanner(System.in);
        String writeMsg = scanner.nextLine();
        byte[] bytes = writeMsg.getBytes();
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }
}
