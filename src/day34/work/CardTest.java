package day34.work;

public class CardTest {
    public static void main(String[] args) {
        Card card = new Card();
        Mother mother = new Mother(card);
        Thread m = new Thread(mother);
        Son son = new Son(card);
        Thread s = new Thread(son);
        m.start();
        s.start();
    }
}
