package day12;

public class NarutoTest {
    public static void main(String[] args) {
        Naruto naruto1 = new Naruto("鸣人", "木叶村", 15);
        Naruto naruto2 = new Naruto("我爱罗", "砂隐村", 22);
        Naruto naruto3 = new Naruto("佩恩", "雨隐村", 18);
        Naruto narutoArr[] = {naruto1, naruto2, naruto3};
        for (Naruto naruto : narutoArr) {
            System.out.println(naruto.person + "--" + naruto.belong + "---" + naruto.age);
        }
    }
}
