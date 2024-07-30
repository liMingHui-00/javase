package day22;

import java.util.Random;

public class D3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("QWERTYUIOPLzxcvbnKqwertyuioplkjhgfdsamJHGFDSAZXCVBNM123456789");
        StringBuilder code = new StringBuilder();
        for (int i = 0; i < 6; i++) {
         code.append(sb.charAt(new Random().nextInt(sb.length())));
        }
        System.out.println(code);
    }
}
