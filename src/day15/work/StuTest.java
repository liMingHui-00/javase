package day15.work;

/**
 * @Author：lmh
 * @Create: 2024-7-15 20:11
 */
public class StuTest {
    public static void main(String[] args) {
        Stu.money = 1000;
        Stu stu1 = new Stu("小明");
        Stu stu2 = new Stu("小红");
        Stu stu3 = new Stu("小丽");
        stu1.hf(50);
        stu1.hf(100);
        stu1.hf(150);
    }
}
