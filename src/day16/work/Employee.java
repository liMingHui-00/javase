package day16.work;

/**
 * @Author：lmh
 * @Create: 2024-7-16 20:34
 */
public class Employee {
    private String sex;
    private int age;
    private  int salary;
    private String name;
    public Employee() {
    }
    public Employee(String sex, int age, int salary, String name) {
        this.sex = sex;
        this.age = age;
        this.salary = salary;
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void writeWeekly(){
        System.out.println(getName()+"-"+getSex()+"-"+getAge()+"-"+getSalary());
    }
}
