package day28;

import java.util.HashMap;

public class D6 {
    public static void main(String[] args) {
        Student s1 = new Student("李四", "河南");
        Student s2 = new Student("王五", "背景");
        Student s3 = new Student("李四", "河南");
        HashMap<String, Student> hashMap = new HashMap<>();
        hashMap.put("河南",s1);
        hashMap.put("河南",s3);
        System.out.println(hashMap);
    }
}
