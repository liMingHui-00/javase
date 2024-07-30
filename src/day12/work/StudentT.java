package day12.work;

/**
 * @Author：lmh
 * @Create: 2024-7-12 19:31
 */
public class StudentT {
    String name;
    int age;
    String content;

    public StudentT(String name, int age, String content) {
        this.name = name;
        this.age = age;
        this.content = content;
    }
    public void eat() {
        System.out.println("年龄为" + age + "的" + name + "同学正在吃饭....");
    }
    public void study(String zj) {
        System.out.println("年龄为" + age + "的" + name + "同学正在专心致志的听着 " + zj + " 的知识....");
    }
}


