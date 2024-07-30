package day11.work;

/**
 * @Author：lmh
 * @Create: 2024-7-11 19:25
 */
public class Coder {
    String name;
    int id;
    int salary;

    public Coder(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public  void work(Coder coder){
        System.out.println("工号为"+coder.id+"基本工资为"+coder.salary+"的程序员"+coder.name+"正在努力的写着代码......");
    }
}
