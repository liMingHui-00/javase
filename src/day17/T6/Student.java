package day17.T6;

/**
 * @Author：lmh
 * @Create: 2024-7-17 19:26
 */
public class Student {
    private String name;
            private int age;

            public void studying(Learn le,Phone p){
                System.out.println(getAge()+"岁的"+getName()+"学习中");
                le.info1();le.info2();le.stu(p);
            }
    public Student() {
    }

    public Student(String name, int age) {
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
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
