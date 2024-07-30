package day21;

import java.util.ArrayList;

public class D4 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("lisi", 20);
        Student s2 = new Student("猪八戒", 22);
        Student s3 = new Student("小丽", 18);
        Student s4 = new Student("麻子", 50);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName()+"-"+list.get(i).getAge());
        }
    }
}
