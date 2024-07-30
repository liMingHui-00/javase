package day9;

/**
 * @Author：lmh
 * @Create: 2024-7-9 11:41
 */
public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name="孙悟空";
        p1.age=18;
        p1.sex="男";
        Person p2 = new Person();
        p2.name="猪八戒";
        p2.age=28;
        p2.sex="男" ;
        Person p3 = new Person();
        p3.name = "沙和尚";
        p3.age = 38;
        p3.sex = "男";
        Person ps[] = {p1,p2,p3};
        for (int i = 0; i < ps.length; i++) {
            Person p = ps[i];
            if (p.age > 18) {
                p.show();
            }
        }
    }
}
