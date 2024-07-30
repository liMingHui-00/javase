package day25.work;

public class Worker {
    private String name;
    private int age;
    private int salary;

    public Worker() {
    }

    public Worker(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public void work(){
        System.out.println(name+"在工作");
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

    /**
     * 获取
     * @return salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * 设置
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return name + " " + age + "  " + salary;
    }
}
