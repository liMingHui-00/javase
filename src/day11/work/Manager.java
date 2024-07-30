package day11.work;

/**
 * @Author：lmh
 * @Create: 2024-7-11 19:17
 */
public class Manager {
    String name;
    int id;
    int salary;
    int bonus;

    public void work(String name, int id, int salary,int bonus) {
         this.id= id;
         this.salary = salary;
         this.name = name;
         this.bonus = bonus;
        System.out.println("工号为"+id+"基本工资为"+salary+"奖金为"+bonus+"的项目经理"+name+"正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
    }
}
