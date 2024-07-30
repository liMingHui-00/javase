package day16;

/**
 * @Author：lmh
 * @Create: 2024-7-16 14:20
 */
public class Animal {
    private String name;
    private int age;

    public void eat(){
      System.out.println("eat");
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
}
