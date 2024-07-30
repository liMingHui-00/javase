package day25;

import java.util.Iterator;
import java.util.LinkedList;

public class StudentTest {
    public static void main(String[] args) {
        LinkedList<Student> list = new LinkedList<>();
        Student s1 = new Student(101, "孙悟空", "男", 18);
        Student s2 = new Student(102, "猪八戒", "男", 28);
        Student s3 = new Student(103, "沙和尚", "男", 38);
//        Student s4 = new Student(104, "唐僧", "男", 188);
        list.add(s1);
        list.add(s2);
        list.add(s3);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAge()>30){
                list.remove(i);
            }
        }

        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
