package day12.work;

/**
 * @Author：lmh
 * @Create: 2024-7-12 19:30
 */
public class Teacher {
    String name;
    int age;
    String content;

    public Teacher(String name, int age, String content) {
        this.name = name;
        this.age = age;
        this.content = content;
    }

    public void eat() {
        System.out.println("年龄为" + age + "的" + name + "老师正在吃饭....");
    }

    public void teach(String kc) {
        System.out.println("年龄为" + age + "的" + name + "老师正在亢奋的讲着 " + kc + " 的知识........");
    }
}
