package day11.work;

/**
 * @Author：lmh
 * @Create: 2024-7-11 19:35
 */
public class Student {
    String name;
    int age;
    String content;

    public void eat(String name, int age){
        System.out.println("年龄为"+age+"的"+name+"同学正在吃饭....");
    }
    public void study(String name, int age, String content){
        System.out.println("年龄为"+age+"的"+name+"同学正在专心致志的听着"+content+"的知识");
    }
}
