package day15.work;

/**
 * @Author：lmh
 * @Create: 2024-7-15 18:26
 */
public class Student {
    private String name;
    private int age;
    private String degree;
    public Student() {
    }
    public Student(String name, int age, String degree) {
        this.name = name;
        this.age = age;
        this.degree = degree;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getDegree() {
        return degree;
    }
    public void setDegree(String degree) {
        this.degree = degree;
    }
}
