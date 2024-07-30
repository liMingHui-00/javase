package day25.work;

import java.util.LinkedList;
import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= list.size(); i++) {
            System.out.println("请输入第"+(i+1)+"个字符串");
            list.add(scanner.next());
            if (list.size()==5){
                break;
            }
        }
        System.out.println(list);
        list.set(1,"华蓝集团");
        System.out.println(list);
        list.add(2,"java");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        System.out.println(list.size());
    }
}
