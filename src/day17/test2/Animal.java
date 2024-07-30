package day17.test2;

/**
 * @Author：lmh
 * @Create: 2024-7-17 15:20
 */
public class Animal {
    String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
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

    public String toString() {
        return "Animal{name = " + name + "}";
    }
}
