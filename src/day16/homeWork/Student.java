package day16.homeWork;

/**
 * @Author：lmh
 * @Create: 2024-7-16 19:57
 */
public class Student extends Person{
    private String school;

    public Student() {
    }

    public Student(String school) {
        this.school = school;
    }

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
    public void printStudent(){
        System.out.println("我叫"+super.getName()+",我今年"+super.getAge()+"岁了，我现在的学校是："+school);
        super.printPerson();
    }
}
