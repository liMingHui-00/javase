package day17.test2;

/**
 * @Author：lmh
 * @Create: 2024-7-17 15:21
 */
public class Snack extends Animal {
    private int age;

    public Snack(int age) {
        this.age = age;
    }

    public Snack(String name, int age) {
        super(name);
        this.age = age;
    }

    public Snack() {
    }

    public void say(){
        System.out.println("sssss");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
