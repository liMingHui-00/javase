package day26.work;

public class Teacher {
    private int id;
   private String name;
   private String sex;
   private int age;
   private int money;

    public Teacher() {
    }

    public Teacher(int id, String name, String sex, int age, int money) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.money = money;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
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
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
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

    /**
     * 获取
     * @return money
     */
    public int getMoney() {
        return money;
    }

    /**
     * 设置
     * @param money
     */
    public void setMoney(int money) {
        this.money = money;
    }

    public String toString() {
        return "T2{id = " + id + ", name = " + name + ", sex = " + sex + ", age = " + age + ", money = " + money + "}";
    }
}
