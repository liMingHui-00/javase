package day12.work;

/**
 * @Author：lmh
 * @Create: 2024-7-12 19:55
 */
public class StudentTwo {
    String name;
    int age;
    String education;
    public StudentTwo() {
    }
    public StudentTwo(String name, int age, String education) {
        this.name = name;
        this.age = age;
        this.education = education;
    }
    public void printInfo() {
        System.out.println(name + "-" + age + "-" + education);
    }
}
