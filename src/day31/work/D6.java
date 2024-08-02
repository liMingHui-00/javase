package day31.work;

public class D6 {
    public static void main(String[] args) {

        D5 d5 = new D5();
        d5.setName("风机");

        D4 d6 = new D4();
        d6.setName("大炮");
        d5.start();
        d6.start();
    }
}
