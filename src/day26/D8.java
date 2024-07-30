package day26;

public class D8 implements Comparable<D8> {
    private String name;
    private int age;
    private int salary;

    public D8() {
    }


    public D8(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "{name = " + name + ", age = " + age + ", salary = " + salary + "}";
    }

    @Override
    public int compareTo(D8 o) {
//        年龄升序  第一个减去第二个
//        第一个就是this
        if(this.age-o.getAge()!=0){
            return this.age-o.getAge();
        }else{
            return 1;
        }

    }
}
