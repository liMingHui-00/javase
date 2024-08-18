package day36;

import java.util.ArrayList;
import java.util.Scanner;

public class D4 {
    public static void main(String[] args) {
        ArrayList<user> list = new ArrayList<>();
        String choose = new Scanner(System.in).next();
        switch (choose){
            case "1":
               login(list);
                break;
//            case "2" -> System.out.println("2");
        }
    }

    private static void login(ArrayList<user> list) {
        System.out.println("登录");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
      boolean flag = checkUsername(username);
    }

    private static boolean checkUsername(String username) {

    }
}
