package day13;

/**
 * @Author：lmh
 * @Create: 2024-7-13 14:26
 */
public class GirlFriend {
    private  String name;
    private  int age;


    public GirlFriend() {
    }

    public GirlFriend(String name, int age) {
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

    public static void main(String[] args) {
        int a= 10;
        int b= a;
        b=33;
        System.out.println(a);
    }
}
