package day26.work;

import java.util.Comparator;
import java.util.TreeSet;

public class TeacherTest {
    public static void main(String[] args) {
        TreeSet<Teacher> treeSet = new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                if (o2.getMoney()-o1.getMoney()!=0){
                    return o2.getMoney()-o1.getMoney();
                }else {
                    return o1.getAge()-o2.getAge();
                }
            }
        });
        Teacher p1 = new Teacher(101, "猿飞日斩", "男", 69, 1560);
        Teacher p2 =   new Teacher(102,"自来也","男",54,3560);
        Teacher p3 = new Teacher(103,"水门","男",24,560);
        Teacher p4 = new Teacher(104,"卡卡西","男",18,3560);
        treeSet.add(p1);
        treeSet.add(p2);
        treeSet.add(p3);
        treeSet.add(p4);
        System.out.println(treeSet);
    }
}
