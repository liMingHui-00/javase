package day16.work;

/**
 * @Author：lmh
 * @Create: 2024-7-16 20:40
 */
public class Programmer extends Employee{
    public Programmer(){}

    public Programmer(String sex, int age, int salary, String name) {
        super(sex, age, salary, name);
    }
    public void writeProject(){
        System.out.println("写工程");
    }
    public  void bug(){
        System.out.println("改bug");
    }
}
