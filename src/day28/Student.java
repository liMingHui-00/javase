package day28;

public class Student {
    private String name;
    private String desc;

    public Student() {
    }

    public Student(String name, String desc) {
        this.name = name;
        this.desc = desc;
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
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 设置
     * @param desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String toString() {
        return "Student{name = " + name + ", desc = " + desc + "}";
    }
}
