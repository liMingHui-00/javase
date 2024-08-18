package day36;

import day11.Student;

import java.util.HashSet;

public class D2 {
    public static void main(String[] args) {
//        ArrayList<Character> list = new ArrayList<>();
//        list.add('2');
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(1);
        HashSet<Student> hashSet = new HashSet<>();

        for (int i = 0; i < 3; i++) {
            Student student = new Student();
            hashSet.add(student);
        }
        System.out.println(hashSet.size());

    }
}
