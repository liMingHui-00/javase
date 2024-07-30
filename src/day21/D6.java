package day21;

import java.util.ArrayList;
import java.util.Scanner;

public class D6 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= list.size(); i++) {
            Student s = new Student();
            System.out.println("请输入学生的姓名：");
            String name = scanner.next();
            System.out.println("请输入学生的年龄：");
            int age = scanner.nextInt();
            s.setName(name);
            s.setAge(age);
            list.add(s);
            if (list.size()==3){
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName()+"-"+list.get(i).getAge());
        }
    }
}
