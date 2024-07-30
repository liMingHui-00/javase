package day12;

/**
 * @Author：lmh
 * @Create: 2024-7-12 16:32
 */
public class Teacher {
    int id;
    String name;
    int salary;

    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Teacher() {
    }

    public Teacher(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public  void say(){
        System.out.println("名字："+name+"--"+"工资："+salary);
    }
    public void teach(String kc){
        System.out.println(name+"在教室教"+kc);
    }
}
