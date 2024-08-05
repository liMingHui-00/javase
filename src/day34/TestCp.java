package day34;

public class TestCp {
    public static void main(String[] args) {
        Saler saler = new Saler();
        Productor productor = new Productor(saler);
        Thread apple = new Thread(productor, "apple");
        Thread person = new Thread(new Customer(saler),"库克");
        apple.start();
        person.start();
    }
}
