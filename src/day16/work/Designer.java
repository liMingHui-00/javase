package day16.work;

/**
 * @Author：lmh
 * @Create: 2024-7-16 20:43
 */
public class Designer extends Employee{
    public Designer() {
    }

    public Designer(String sex, int age, int salary, String name) {
        super(sex, age, salary, name);
    }
    public void designProject(){
        System.out.println("设计程序");
    }
    public void cutPicture(){
        System.out.println("抠图");
    }
}
