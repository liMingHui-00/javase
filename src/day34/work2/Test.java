package day34.work2;

public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Thread m = new Thread(bank,"妈妈");
        Thread b = new Thread(bank,"爸爸");
        m.start();
        b.start();
    }
}
