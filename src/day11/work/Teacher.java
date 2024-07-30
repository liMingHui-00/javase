package day11.work;

/**
 * @Author：lmh
 * @Create: 2024-7-11 19:30
 */
public class Teacher {
    String name;
    int age;
    String content;
    public void eat(int age,String name){
        System.out.println("年龄为"+age+"的"+name+"老师正在吃饭....");
    }
    public void teach(int age,String name,String content){
        System.out.println("年龄为"+age+"的"+name+"老师正在亢奋的讲着"+content+"的知识");
    }
}
