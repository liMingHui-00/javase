package day26;

import java.util.Comparator;
import java.util.TreeSet;

public class D10 {
    public static void main(String[] args) {
        Student s1 = new Student("那里多", 18);
        Student s2 = new Student("杀死给", 28);
        Student s3 = new Student("小樱", 38);
        Student s4 = new Student("一袋米抗几楼", 38);
        Student s5 = new Student("一袋米抗几楼", 38);
        TreeSet<Student> set = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int age =o1.getAge()- o2.getAge();
                if (age!=0){
                    return age ;
                }else {
                    return 1;
                }
            }
        });
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);
        System.out.println(set);

    }
}
