package day15.work;

/**
 * @Author：lmh
 * @Create: 2024-7-15 19:59
 */
public class Stu {
    private String name;
    private String gender;
    private int age;
    static int money;
    public void hf(int mo){
        money-=mo;
        System.out.println(name+"花了"+mo+"还剩余"+money);
    }
//    public  void hh(int money){
//        this.m
//    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static void setMoney(int money) {
        Stu.money = money;
    }
    public Stu(String name) {
        this.name = name;
    }
}
