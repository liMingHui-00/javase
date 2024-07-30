package day17.T5;

/**
 * @Author：lmh
 * @Create: 2024-7-17 19:16
 */
public class Person {
    private String name;
    private int age;
    public void palyPhone(Phone p){
        System.out.println(getAge()+"岁的"+getName()+"正在玩手机，手机的品牌是"+p.getBrand()+",价格是"+p.getPrice());
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Person{name = " + name + ", age = " + age + "}";
    }
}
