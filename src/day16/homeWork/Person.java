package day16.homeWork;

/**
 * @Author：lmh
 * @Create: 2024-7-16 19:54
 */
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
    public void printPerson(){
        System.out.println("我是山顶洞人");
    }
}
