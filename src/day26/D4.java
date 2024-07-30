package day26;

import java.util.Objects;

public class D4 {
    private String name;
    private int age;

    public D4() {
    }

    public D4(String name, int age) {
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
        return "D4{name = " + name + ", age = " + age + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        D4 d4 = (D4) o;
        return age == d4.age && Objects.equals(name, d4.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
