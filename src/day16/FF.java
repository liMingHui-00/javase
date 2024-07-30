package day16;

/**
 * @Author：lmh
 * @Create: 2024-7-16 16:38
 */
public class FF {
    private int age;
    private String name;

    public FF() {
    }

    public FF(int age, String name) {
        System.out.println("有参");
        this.age = age;
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
}
