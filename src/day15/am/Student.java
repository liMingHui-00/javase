package day15.am;
/*
* 类变量使用static修饰，作用于整个类
* */
public class Student {
    String name;
    static  int age;

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "李四";
//        student.age=15;
        Student.age=100;
        Student student1 = new Student();
        student1.name="王五";
//        student1.age=55;
        System.out.println(student.name);
        System.out.println(student1.name);
        System.out.println(student.age);
        System.out.println(student1.age);
    }
}
