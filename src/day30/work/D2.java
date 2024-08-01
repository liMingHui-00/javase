package day30.work;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class D2 {
//    序列化
    public static void serialize(List<Student> list){
        try(FileOutputStream fileOutputStream = new FileOutputStream("aa/student.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(list);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
//    反序列化
    public static Object deserialize() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("aa/student.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        return objectInputStream.readObject();
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s1 = new Student("101", "孙悟空", "男", 18);
        Student s2 = new Student("102", "猪八戒", "男", 28);
        Student s3 = new Student("103", "沙悟净", "男", 38);
        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);studentList.add(s2);studentList.add(s3);
//        把集合写入到文件中
        serialize(studentList);
//        把文件中的集合遍历出来
        List<Student> deserialize = (List<Student>) deserialize();
        for (Student student : deserialize) {
            System.out.println(student);
        }

    }
}
